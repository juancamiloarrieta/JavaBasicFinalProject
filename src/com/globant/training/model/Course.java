package com.globant.training.model;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String id;
    private String name;
    private String classroom;
    private List<Student> students;
    private Teacher teacher;

    public void setId(String id){
        this.id=id;
    }

    public List<Student> getStudents(){
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addTeacher(Teacher teacher){
        this.teacher=teacher;
    };

    public String getId() {
        return id;
    }

    public Course(String name, String classroom) {
        this.name = name;
        this.classroom = classroom;
        this.students = new ArrayList<>();
    }

    public Course(String id, String name, String classroom, List<Student> students, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
        this.students = students;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", classroom='" + classroom + '\'' +
                '}';
    }


    public String toFullString() {
        return "Class{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", classroom='" + classroom + '\'' +
                ", students=" + students +
                ", teacher=" + teacher +
                '}';
    }
}
