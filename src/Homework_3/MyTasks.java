package Homework_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyTasks {
    public static void main(String[] args) {
        getSeasonSwitch();
        getSeasonIf();
        calculateRemainder();
        calculateTemperature();
        getColour();
        writeOddNumbers();
        writeNumbers();
        calculateSum();
        calculateSequence();
        getFirstNumbers();
        getSquare();
        getFibonacciValue();
        calculateIncome();
        getMultiplicationTable();

    }

    public static Scanner inputData() {
        return new Scanner(System.in);
    }

    public static void getSeasonSwitch() {
        //Написать программу для вывода названия поры года по номеру месяца.
        //При решении используйте оператор switch-case.
        System.out.println("Please, enter month № from 1 to 12: ");
        int month = inputData().nextInt();
        switch (month) {
            case (1):
                System.out.println("You entered: " + month + ". It's winter");
                break;
            case (2):
                System.out.println("You entered: " + month + ". It's winter");
                break;
            case (3):
                System.out.println("You entered: " + month + ". It's spring");
                break;
            case (4):
                System.out.println("You entered: " + month + ". It's spring");
                break;
            case (5):
                System.out.println("You entered: " + month + ". It's spring");
                break;
            case (6):
                System.out.println("You entered: " + month + ". It's summer");
                break;
            case (7):
                System.out.println("You entered: " + month + ". It's summer");
                break;
            case (8):
                System.out.println("You entered: " + month + ". It's summer");
                break;
            case (9):
                System.out.println("You entered: " + month + ". It's autumn ");
                break;
            case (10):
                System.out.println("You entered: " + month + ". It's autumn");
                break;
            case (11):
                System.out.println("You entered: " + month + ". It's autumn");
                break;
            case (12):
                System.out.println("You entered: " + month + ". It's winter");
                break;
            default:
                System.out.println("You entered: " + month + ". It's incorrect №");
                break;
        }
    }

    public static void getSeasonIf() {
        //Написать программу для вывода названия поры года по номеру месяца.
        //При решении используйте оператор if-else-if.
        System.out.println("Please, enter month № from 1 to 12: ");
        int month = inputData().nextInt();
        if (month == 1 || month == 2 || month == 12) {
            System.out.println("It's winter");
        } else if (month >= 3 && month <= 5) {
            System.out.println("It's spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("It's summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("It's autumn");
        } else {
            System.out.println("It's incorrect number");
        }


    }

    public static void calculateRemainder() {
        //Напишите программу, которая будет принимать на вход число и на
        //выход будет выводить сообщение четное число или нет.
        //Для определения четности числа используйте операцию получения
        //остатка от деления - операция выглядит так: '% 2').
        try {
            System.out.println("Please, enter integer number from -2147483648 to 2147483647: ");
            int num = inputData().nextInt();
            num %= 2;
            if (num == 0) {
                System.out.println("An even number");
            } else {
                System.out.println("An odd number");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer number");
        }

    }

    public static void calculateTemperature() {
        //Для введенного числа t (температура на улице) вывести
        // Если t>–5, то вывести «Тепло».
        //Если –5>= t > –20, то вывести «Нормально».
        //Если –20>= t, то вывести «Холодно».
        System.out.println("Please, enter outdoor temperature: ");
        int t = inputData().nextInt();
        if (t > -5) {
            System.out.println("It's warm");
        } else if (t <= -5 && t > -20) {
            System.out.println("It's normal");
        } else if (t <= -20) {
            System.out.println("It's cold");
        }
    }

    public static void getColour() {
        //По введенному номеру определить цвет радуги (1 –красный, 4 – зеленый и т. д.)
        System.out.println("Please, enter rainbow № from 1 to 7: ");
        int num = inputData().nextInt();
        switch (num) {
            case (1):
                System.out.println("You entered: " + num + ". It's red");
                break;
            case (2):
                System.out.println("You entered: " + num + ". It's orange");
                break;
            case (3):
                System.out.println("You entered: " + num + ". It's yellow");
                break;
            case (4):
                System.out.println("You entered: " + num + ". It's green");
                break;
            case (5):
                System.out.println("You entered: " + num + ". It's blue");
                break;
            case (6):
                System.out.println("You entered: " + num + ". It's indigo ");
                break;
            case (7):
                System.out.println("You entered: " + num + ". It's violet ");
                break;
            default:
                System.out.println("You entered: " + num + ". It's incorrect №");
                break;
        }
    }

    public static void writeOddNumbers() {
        //При помощи цикла for вывести на экран нечетные числа от 1 до 99
        //При решении используйте операцию инкремента (++).
        System.out.println("Odd numbers from 1 to 99");
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void writeNumbers() {
        //Необходимо вывести на экран числа от 5 до 1
        //При решении используйте операцию декремента (--).
        for (int i = 5; i >= 1; i--) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    public static void calculateSum() {
        //Напишите программу, где пользователь вводит любое целое
        //положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
        //Для ввода числа воспользуйтесь классом Scanner.
        System.out.println("Please, enter positive number: ");
        int x = inputData().nextInt();
        if (x >= 0) {
            int y;
            y = x * (x + 1) / 2;
            System.out.println("Sum from 1 to " + x + " is " + y);
        } else {
            System.out.println("It's not positive number");
        }
    }

    public static void calculateSequence() {
        //Необходимо, чтоб программа выводила на экран вот такую последовательность:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        //В решении используйте цикл while..
        int i = 7;
        while (i <= 98) {
            System.out.print(i + " ");
            i += 7;
        }
        System.out.println();
    }

    public static void getFirstNumbers() {
        //Вывести 10 первых чисел последовательности 0, -5,-10,-15..
        int first = 0;
        int dif = -5;

        for (int i = 0; i < 10; i++) {
            System.out.print(first + " " );
            first += dif;
        }
        System.out.println();
    }

    public static void getSquare() {
        //Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
        for (int i = 10; i <= 20; i++) {
            System.out.println("The square of the " + i + " is " + (i * i));
        }
    }

    public static void getFibonacciValue() {
        //Выведите на экран первые 11 членов последовательности Фибоначчи. Рекурсия
        // 0; 1; 1; 2; 3; 5; 8; 13; 21; 34; 55....
        int n = 11;
        int a = 0, b = 1;
        System.out.print("Fibonacci Value: " + a + " , "  + b + " , ");
        for (int i = 2; i < n; i++) {
            int next = a + b; // вычисляем число Ф как сумму двух предыдущих чисел
            System.out.print(next + " , ");
            a=b; // сдвигаем значения, теперь предыдущий становится текущим числом
            b=next; // текущее число становится новым числом (вычисляется в next)
        }
        System.out.println();
    }

    public static void calculateIncome() {
        //За каждый месяц банк начисляет к сумме вклада 7% от суммы.
        //Напишите программу, в которую пользователь вводит сумму вклада и
        //количество месяцев. А банк вычисляет конечную сумму вклада с учетом
        //начисления процентов за каждый месяц.
        //Для вычисления суммы с учетом процентов используйте цикл for.
        // Пусть сумма вклада будет представлять тип float.
        System.out.println("Enter the amount of the deposit ");
        float dep = inputData().nextFloat();
        System.out.println("Enter month № ");
        int month = inputData().nextInt();
        float sum;
        for (int i = 1; i <= month; i++) {
            sum = dep+dep*0.07f;
            System.out.println(i + " month " + sum);
            dep=sum;
        }
    }

    public  static void getMultiplicationTable(){
        System.out.println("Enter number for counting multiplication table");
        int n = inputData().nextInt();
        for (int i=1; i <= n; i++) {
            for (int j=1; j<= n; j++){
                System.out.println( i + " * " + j + " = " + i*j);
            }
        }

    }

}
