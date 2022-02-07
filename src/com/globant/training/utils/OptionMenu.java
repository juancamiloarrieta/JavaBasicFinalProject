package com.globant.training.utils;

public class OptionMenu {

    public void printMainMenu(){
        System.out.println("Main Menu");
        System.out.println("send the number of the option wanted");
        System.out.println("---------");
        System.out.println("1. Print all the professors");
        System.out.println("2. Print all the classes");
        System.out.println("3. Create a new student");
        System.out.println("4. Create a new Class");
        System.out.println("5. List all the classes");
        System.out.println("6. Exit");

    }

    public void printCoursesMenu(){
        System.out.println("Courses Menu");
        System.out.println("send the number of the option wanted");
        System.out.println("---------");
        System.out.println("1. Print all the classes Info");
        System.out.println("2. Print class info by id");
        System.out.println("3. Exit");

    }
}