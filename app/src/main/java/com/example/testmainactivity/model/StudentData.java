package com.example.testmainactivity.model;

import org.json.JSONException;
import org.json.JSONObject;

public class StudentData {
    private String school;
    private String sex;
    private String num;

    public StudentData(JSONObject object) throws JSONException {
        school = object.getString("school");
        sex = object.getString("sex");
        num = object.getString("num");
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "StudentData{" +
                "school='" + school + '\'' +
                ", sex='" + sex + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}
