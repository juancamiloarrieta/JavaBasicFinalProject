package com.globant.training;

import com.globant.training.model.Course;
import com.globant.training.model.Student;
import com.globant.training.model.University;
import com.globant.training.utils.Initializer;
import com.globant.training.utils.OptionMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        OptionMenu menu = new OptionMenu();

        Initializer initializer = new Initializer();
        University university = initializer.initializeUniversity();

        String option = "1";
        while(!option.equals("6")) {
            menu.printMainMenu();
            option = scanner.nextLine();
            if (option.equals("1")) {
                System.out.println(university.getTeachers().toString());
            }
            if (option.equals("2")) {
                System.out.println(university.getCourses().toString());
                String optionCourses = "1";
                while (!optionCourses.equals("3")) {
                    menu.printCoursesMenu();
                    optionCourses = scanner.nextLine();
                    if (optionCourses.equals("1")) {
                        for (Course course : university.getCourses()) {
                            System.out.println(course.toFullString());
                        }
                    }
                    if (optionCourses.equals("2")) {
                        System.out.println("Send the Class Id");
                        String courseId = scanner.nextLine();
                        System.out.println(university.searchCourseById(courseId).toFullString());
                    }
                }
            }
            if (option.equals("3")) {
                System.out.println("Send the student name");
                String studentName = scanner.nextLine();
                System.out.println("Send the age");
                String studentage = scanner.nextLine();
                System.out.println("Send the class id");
                String classId = scanner.nextLine();
                Student student = new Student(studentName, Double.parseDouble(studentage));
                university.createStudent(student, classId);
            }
            if(option.equals("4")){
                System.out.println("Send the class name");
                String className = scanner.nextLine();
                System.out.println("Send the classroom");
                String classroom = scanner.nextLine();
                Course course = new Course(className,classroom);
                String optionCourse = "";
                System.out.println("Send the students ids and send 'done' when its over");
                optionCourse = scanner.nextLine();
                List<String> idStudents = new ArrayList<>();
                while(!optionCourse.equals("done")){
                    idStudents.add(optionCourse);
                    optionCourse = scanner.nextLine();
                }
                System.out.println("Sen the teacher id");
                String teacherId = scanner.nextLine();
                university.createCourse(course,idStudents,teacherId);
            }
            if(option.equals("5")){
                System.out.println("Send the student id");
                String studentId = scanner.nextLine();
                System.out.println(university.searchCoursesByStudentId(studentId).toString());
            }
        }



    }
}
