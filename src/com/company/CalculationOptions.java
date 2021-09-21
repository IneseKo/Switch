package com.company;

import java.util.Scanner;

public class CalculationOptions {
    public static void main(String[] args) {
        System.out.println("Please enter variable No.1:");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        System.out.println("Please enter variable No.2:");
        double num2 = input.nextDouble();
        System.out.println("Please enter the desired calculation option's sign:\n" +
                " ‘+’ to sum both elements;\n" +
                " ’-’ to do subtraction; \n" +
                " ’/’ to do dividing; \n" +
                " ‘*’ to do multiplication; \n" +
                " ‘%’ to get remainder when the first element is divided by the second element;\n" +
                " ‘p’ to print out both elements;\n" +
                " ‘b’ to verify which element is bigger;\n" +
                " ‘s’ to verify which element is smaller;");
        char action = input.next().charAt(0);
        switch (action){
            case '+':
                System.out.println("The result is " + (num1 + num2));
                break;
            case '-':
                System.out.println("The result is " + (num1 - num2));
                break;
            case '/':
                System.out.println("The result is " + (num1 / num2));
                break;
            case '*':
                System.out.println("The result is " + (num1 * num2));
                break;
            case '%':
                System.out.println("The result is " + (num1 % num2));
                break;
            case 'p':
                System.out.println(num1 + " and " + num2);
                break;
            case 'b':
                if (num1>num2) System.out.println(num1 + " is bigger than " + num2);
                else if (num2>num1) System.out.println(num2 + " is bigger than " + num1);
                else System.out.println("Both numbers are equal.");
                break;
            case 's':
                if (num1<num2) System.out.println(num1 + " is smaller than " + num2);
                else if (num2<num1) System.out.println(num2 + " is smaller than " + num1);
                else System.out.println("Both numbers are equal.");
                break;
            default:
                System.out.println("Wrong action! Try again.");

        }
        }
    }
