package Homework_2.example;

import java.util.Scanner;

public class MyBMICalculator {

    public static void main (String[] args){
        introduceBMICalculator();
    }

    public static void introduceBMICalculator(){
        System.out.println("Welcome to BMI");
        getData();
    }

    public static void getData(){
        System.out.println("Please, enter your height in sm: ");
        int height = inputData().nextInt();
        System.out.println("Please, enter your weight in kg: ");
        double weight = inputData().nextDouble();
    }

    public static Scanner inputData(){
        return new Scanner(System.in);
    }
}
