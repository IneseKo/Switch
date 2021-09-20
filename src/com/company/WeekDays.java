package com.company;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        System.out.println("Please enter the day of the week using numbers:");
        Scanner input = new Scanner(System.in);
        int dayOfTheWeekNumber = input.nextInt();
        switch (dayOfTheWeekNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is working Day");
                break;
            case 6:
            case 7:
                System.out.println("It is a Holiday");
                break;
            default:
                System.out.println("There is no such Day within a Week");
        }
    }
}
