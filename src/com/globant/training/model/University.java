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

    public void createTeacher(Teacher teacher, String classId){
        this.idCounter++;
        teacher.setId(String.valueOf(idCounter));
        this.teachers.add(teacher);
        for (Course course: courses) {
            if(course.getId() == classId){
                course.addTeacher(teacher);
            }
        }
    };

    public void createStudent(Student student, String classId){
        this.idCounter++;
        student.setId(String.valueOf(idCounter));
        this.students.add(student);
        for (Course course: courses) {
            if(course.getId().equals(classId)){
                course.addStudent(student);
            }
        }
    }

    public void createCourse(Course course, List<String> idStudents, String idTeacher){
        this.idCounter++;
        course.setId(String.valueOf(idCounter));
        for (String id: idStudents) {
            for (Student student: students) {
                if(student.getId().equals(id)){
                    course.addStudent(student);
                }
            }
        }
        for (Teacher teacher: teachers) {
            if(teacher.getId().equals(idTeacher)){
                course.addTeacher(teacher);
            }
        }
        this.courses.add(course);
    }

    public List<Course> searchCoursesByStudentId(String id){
        List<Course> coursesList = new ArrayList<>();
        for (Course course: courses) {
            for (Student student: course.getStudents()) {
                if(student.getId().equals(id)){
                    coursesList.add(course);
                }
            }
        }
        return coursesList;
    }

    public Course searchCourseById(String id){
        for (Course course: courses) {
            if(course.getId().equals(id)){
                return course;
            }
        }
        return new Course("","");
    }

    public University(String name) {
        this.name = name;
        this.teachers= new ArrayList<>();
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public University(String name, List<Course> courses, List<Student> students, List<Teacher> teachers) {
        this.name = name;
        this.courses = courses;
        this.students = students;
        this.teachers = teachers;
    }
}
