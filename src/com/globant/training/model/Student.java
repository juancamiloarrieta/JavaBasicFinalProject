package com.globant.training.model;

public class Student {

    private String id;
    private String name;
    private double age;

    public void setId(String id){
        this.id=id;
    }

    public String getId(){
        return id;
    }

    public Student(String name, double age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
