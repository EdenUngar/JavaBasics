package com.company;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        boolean hasACat = true;
        char favoriteLetter = 'a';
        String weather = "It is a cold day today";
        int numberOfStudentsInClassroom = 1;
        double averageGpa = 3.7;

        int myAge = 16;
        String nameOfCat = "Indy";
        boolean hasASibling = true;
        char gradeInMath = 'a';
        double percentAnswersCorrect = 87.9;
        int numberOfCats = 4;
        String myName = "Eden";
        char myLeastFavoriteLetter = 'x';
        int aPrettyGoodNumber = 18;
        boolean isInHighSchool = true;

        double multiplication = percentAnswersCorrect * 1.3;
        int addition = myAge + 12;

        System.out.println((double)myAge / numberOfCats + (5*4));
        System.out.println(addition);
        System.out.println(myAge / percentAnswersCorrect + (addition * myAge));
        System.out.println(myName + ", " + weather);

        System.out.print(myName);
        System.out.print(" is ");
        System.out.println("nice");

        String name = "Eden";
        String hello = "hello";

//        System.out.println("What is your name?");
//        name = input.nextLine();
//        System.out.println(hello + " " + name);
//
//        int age = 16;
//
//        System.out.println("How old are you?");
//        age = input.nextByte();
//        input.nextLine();
//        System.out.println("you are " + age + " years old " + name);
//
//        System.out.println("What greeting would you like?");
//        hello = input.nextLine();
//        System.out.println(hello + " " + name);

        System.out.println("What is your age?");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("What would you like me to call you?");
        name = input.nextLine();

        System.out.println(hello + " " + name + "! " + "You are " + age + "! ");









    }
}
