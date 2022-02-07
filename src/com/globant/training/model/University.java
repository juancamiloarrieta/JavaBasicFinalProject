package com.globant.training.model;


import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private List<Course> courses;
    private List<Student> students;
    private List<Teacher> teachers;
    private static double idCounter;

    public List<Teacher> getTeachers(){
        return teachers;
    }

    public List<Course> getCourses(){
        return courses;
    }

    public void addTeacher(Teacher teacher){
        this.teachers.add(teacher);
    };

    public void createStudent(Student student, String classId){
        this.idCounter++;
        student.setId(String.valueOf(idCounter));
        this.students.add(student);
        for (Course course: courses) {
            if(course.getId() == classId){
                course.addStudent(student);
            }
        }
    }

    public void createCourse(Course course, List<String> idStudents, String idTeacher){
        this.idCounter++;
        course.setId(String.valueOf(idCounter));
        for (String id: idStudents) {
            for (Student student: students) {
                if(student.getId() == id){
                    course.addStudent(student);
                }
            }
        }
        for (Teacher teacher: teachers) {
            if(teacher.getId() == idTeacher){
                course.addTeacher(teacher);
            }
        }
        this.courses.add(course);
    }

    public List<Course> searchCoursesByStudentId(String id){
        List<Course> courses = new ArrayList<>();
        for (Course course: courses) {
            for (Student student: course.getStudents()) {
                if(student.getId() == id){
                    courses.add(course);
                }
            }
        }
        return courses;
    }

    public University(String name) {
        this.name = name;
    }
}
