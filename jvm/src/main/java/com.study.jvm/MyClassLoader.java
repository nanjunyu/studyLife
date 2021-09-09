package com.study.jvm;

import com.sun.nio.file.ExtendedCopyOption;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/**
 * MyClassLoader
 * @author nanjunyu
 */
public class MyClassLoader extends ClassLoader
{
    public MyClassLoader()
    {

    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException
    {
        String myPath = "D:\\test\\" + name.replace(".","/") + ".class";
        System.out.println(myPath);

        File file = new File(myPath);
        try{
            byte[] bytes = getClassBytes(file);
            //defineClass方法可以把二进制流字节组成的文件转换为一个java.lang.Class
            return this.defineClass(name, bytes, 0, bytes.length);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return super.findClass(name);
    }

    private byte[] getClassBytes(File file) throws Exception
    {
        // 这里要读入.class的字节，因此要使用字节流
        FileInputStream fis = new FileInputStream(file);
        FileChannel fc = fis.getChannel();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        WritableByteChannel wbc = Channels.newChannel(baos);
        ByteBuffer by = ByteBuffer.allocate(1024);

        while (true){
            int i = fc.read(by);
            if (i == 0 || i == -1) {
                break;
            }
            by.flip();
            wbc.write(by);
            by.clear();
        }
        fis.close();
        return baos.toByteArray();
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        MyClassLoader loader = new MyClassLoader();
        Class<?> aClass = loader.findClass("com.study.jvm.People");
        try {
            Object obj = aClass.newInstance();
            Method method = aClass.getMethod("show");
            method.invoke(obj);
            System.out.println(aClass.getClassLoader());
            System.out.println(String.class.getClassLoader());
            System.out.println(ExtendedCopyOption.class.getClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
