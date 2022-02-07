package com.globant.training.model.teacherChildren;

import com.globant.training.model.Teacher;

public class PartTimeTeacher extends Teacher {

    private double hoursPerWeekAmount;

    public PartTimeTeacher(String id, String name, double baseSalary, double hoursPerWeekAmount) {
        super(id, name, baseSalary);
        this.hoursPerWeekAmount = hoursPerWeekAmount;
    }

    @Override
    public double getSalary(double baseSalary) {
        return baseSalary *hoursPerWeekAmount;
    }

}
