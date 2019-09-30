package com.stackroute.domain;

public class Actor {
    private String actorName;
    private String gender;
    private int age;

    public Actor(String actorName, String gender, int age) {
        this.actorName = actorName;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actorName='" + actorName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}