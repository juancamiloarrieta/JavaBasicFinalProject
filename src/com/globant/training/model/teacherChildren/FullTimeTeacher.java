package com.globant.training.model.teacherChildren;

import com.globant.training.model.Teacher;

public class FullTimeTeacher extends Teacher {

    private double experienceTime;

    public FullTimeTeacher(String id, String name, double baseSalary, double experienceTime) {
        super(id, name, baseSalary);
        this.experienceTime = experienceTime;
    }

    @Override
    public double getSalary(double baseSalary) {
        return baseSalary * 1.1 * experienceTime;
    }
}
