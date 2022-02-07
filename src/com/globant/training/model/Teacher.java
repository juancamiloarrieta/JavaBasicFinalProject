package com.globant.training.model;

public abstract class Teacher {
    private String id;
    private String name;
    private double baseSalary;

    public void setId(String id){
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public abstract double getSalary(double baseSalary);

    public Teacher(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
