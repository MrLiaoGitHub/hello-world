package com.youmeek.demo;

/**
 * Created by liaoziqiang on 2017-01-07.
 */
public class Student {
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Name: " + name + ", Age: " + age;
    }
}
