package com.globant.training.utils;

import com.globant.training.model.Course;
import com.globant.training.model.Student;
import com.globant.training.model.Teacher;
import com.globant.training.model.University;
import com.globant.training.model.teacherChildren.FullTimeTeacher;
import com.globant.training.model.teacherChildren.PartTimeTeacher;

import java.util.ArrayList;
import java.util.List;

public class Initializer {

    public University initializeUniversity(){

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new PartTimeTeacher("a","Juan",1000,15));
        teachers.add(new PartTimeTeacher("b","Pedro",1000,15));
        teachers.add(new FullTimeTeacher("c","Camilo",1000,15));
        teachers.add(new FullTimeTeacher("d","Luis",1000,15));

        List<Student> students = new ArrayList<>();
        students.add(new Student("e","Andrea",20));
        students.add(new Student("f","Camila",21));
        students.add(new Student("g","Alexa",22));
        students.add(new Student("h","Maria",23));
        students.add(new Student("i","Ana",24));
        students.add(new Student("j","Carla",25));

        List<Course> courses = new ArrayList<>();
        courses.add(new Course("n","fisica","101",students,new PartTimeTeacher("a","Juan",1000,15)));
        courses.add(new Course("k","Algebra","102",students,new PartTimeTeacher("b","Pedro",1000,15)));
        courses.add(new Course("l","Biologia","103",students,new PartTimeTeacher("c","Camilo",1000,15)));
        courses.add(new Course("m","Quimica","104",students,new PartTimeTeacher("d","Luis",1000,15)));

        University university = new University("TAE Academy",courses,students,teachers);

        return university;
    }

}
