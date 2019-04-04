package com.stduy.threads;

/**
 * @Author Frank
 * @Date Create in  2019/3/15 15:21
 */
public class Res {
    private String name;
    private String sex;
    private boolean flag = false;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
