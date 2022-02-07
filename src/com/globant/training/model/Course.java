package com.globant.training.model;

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
    }

    @Override
    public String toString() {
        return "Class{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", classroom='" + classroom + '\'' +
                ", students=" + students +
                ", teacher=" + teacher +
                '}';
    }
}
