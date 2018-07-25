package com.zqf.model;

/**
 * Created by james on 6/6/17.
 * 为演示GraphQL union创建的实体
 *
 * blog: www.zhaiqianfeng.com
 */
public class Fish4Union {
    private String name;
    private String tailColor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTailColor() {
        return tailColor;
    }

    public void setTailColor(String tailColor) {
        this.tailColor = tailColor;
    }
}
