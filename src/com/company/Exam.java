package com.company;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        System.out.println("What grade did the Student get in the Exam?");
        Scanner input = new Scanner(System.in);
        char grade = input.next().charAt(0);
        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("Perfect! You are so clever!");
                break;
            case 'C':
                System.out.println("Good! But You can do better!");
                break;
            case 'D':
            case 'E':
                System.out.println("It is not good. You should study!");
                break;
            case 'F':
                System.out.println("Fail! You need to repeat the Exam!");
                break;
            default:
                System.out.println("There is no such grade! Please try again!");
        }

    }
}
