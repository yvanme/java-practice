package com.loong.graphql;

/**
 * Created by james on 6/6/17.
 * 为演示GraphQL创建的实体
 *
 * blog: www.zhaiqianfeng.com
 */
public class User {
    private String sex;
    private String name;
    private String intro;
    private String[] skills;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }
}