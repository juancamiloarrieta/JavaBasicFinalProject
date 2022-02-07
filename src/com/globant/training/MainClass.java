package com.globant.training;

import com.globant.training.model.Student;
import com.globant.training.model.Teacher;
import com.globant.training.model.University;
import com.globant.training.model.teacherChildren.FullTimeTeacher;
import com.globant.training.model.teacherChildren.PartTimeTeacher;
import com.globant.training.utils.OptionMenu;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        OptionMenu menu = new OptionMenu();

        Teacher Juan = new PartTimeTeacher("a","Juan",1000,15);
        Teacher Pedro = new PartTimeTeacher("a","Pedro",1000,15);
        Teacher Camilo = new FullTimeTeacher("a","Camilo",1000,15);
        Teacher Luis = new FullTimeTeacher("a","Luis",1000,15);

        Student Andrea = new Student("Andrea",20);
        Student Camila = new Student("Camila",21);
        Student Alexa = new Student("Alexa",22);
        Student Maria = new Student("Maria",23);
        Student Ana = new Student("Ana",24);
        Student Carla = new Student("Carla",25);

        University university = new University("TAE Academy");
        university.addTeacher(Juan);
        university.addTeacher(Pedro);
        university.addTeacher(Pedro);
        university.addTeacher(Pedro);


        String option = "0";
        while(option != "6"){
            menu.printMainMenu();
        }

    }
}
