package com.ducluanxutrieu.ducluan.fragmentdemo;

public class Student {
    private int avatar;
    private String name;
    private String id;
    private String address;
    private String score;

    public Student(int avatar, String name, String id, String address, String score) {
        this.avatar = avatar;
        this.name = name;
        this.id = id;
        this.address = address;
        this.score = score;
    }

    public int getAvatar() {
        return avatar;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getScore() {
        return score;
    }
}
