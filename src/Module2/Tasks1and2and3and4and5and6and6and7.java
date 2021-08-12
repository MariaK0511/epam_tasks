package Module2;

import java.util.Scanner;

public class Tasks1and2and3and4and5and6and6and7 {
    public static void main(String[] args) {
        tak1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void tak1() {
        //1. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран цифру 7, в противном случае – цифру 8.
        int num1 = 10;
        int num2 = 20;
        if (num1 < num2) {
            System.out.println("7");
        } else {
            System.out.println("8");
        }
    }

    private static void task2() {
        //"2. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран «yes», в противном случае – слово «no»
        int num1 = 33;
        int num2 = 24;
        if (num1 < num2) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    private static void task3() {
        //3. Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no»
        int a = 6;
        if (a > 3) {
            System.out.println("yes");
        } else if (a < 6) {
            System.out.println("no");
        }
    }

    private static void task4() {
        //4. Составить программу: равны ли два числа а и b
        int a = 8;
        int b = 9;
        if (a == b) {
            System.out.println("числа а и b равны" + a + " = " + b);
        } else {
            System.out.println("числа а и b  не равны" + a + " != " + b);
        }
    }

    private static void task5() {
        //5. Составить программу: определения наименьшего из двух чисел а и b.
        int a = 12;
        int b = 15;
        if (a < b) {
            System.out.println("Число а = " + a + " меньше числа b = " + b);
        } else if (a == b) {
            System.out.println("Число а = " + a + " равно числу b = " + b);
        } else {
            System.out.println("Число b = " + b + " меньше числа а = " + a);
        }
    }

    public static void task6() {
        //7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х
        //не совсем понимаю как с модулями решать
        int a = 3;
        int b = 10;
        int c = 12;
        int x = 2;
        int result = a * x * x + b * x + c;
        if (x > 0) {
            System.out.println(result * a);
        } else
            System.out.println(result);
    }

    private static void task7() {
        // Составить программу: определения наибольшего из двух чисел а и b.
        int a = 14;
        int b = 10;

        if (a > b) {
            System.out.println("Число а = " + a + " больше числа b = " + b);
        } else if (a == b) {
            System.out.println("Число а = " + a + " равно числу b = " + b);
        } else {
            System.out.println("Число b = " + b + " больше числа а = " + a);
        }
    }
}