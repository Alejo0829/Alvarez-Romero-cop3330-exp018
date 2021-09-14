package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solutions
 * Copyright 2021 Rafael Alvarez-Romero
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select conversion, 1 for Celsius to Fahrenheit, 2 for Fahrenheit to Celsius: " );
        int conversionstatus = sc.nextInt();
        if(conversionstatus == 1){
            System.out.println("Please enter Celsius temperature: ");
            double Celsiusf = sc.nextDouble();
            double newtemp1 = (((Celsiusf * 9) /5) +32);
            System.out.println("Fahrenheit temperature is now "+ newtemp1);
        }
        else if (conversionstatus == 2){
            System.out.println("Please enter Fahrenheit temperature: ");
            double Fahrenheitc = sc.nextDouble();
            double newtemp2 = (((Fahrenheitc - 32) * 5) /9);
            System.out.println("Celsius temperature is now "+ newtemp2);
        }
        else{
            System.out.println("Please choose between 1 or 2");
        }
    }
}
