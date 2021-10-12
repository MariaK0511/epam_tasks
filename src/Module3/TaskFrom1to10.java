package Module3;

import java.util.Scanner;
import java.math.BigInteger;

public class TaskFrom1to10 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    private static void task1() {
        //1.Необходимо вывести на экран числа от 1 до 5.
        for (int x = 1; x <= 5; x++) {
            System.out.print(x + " ");
        }
    }

    private static void task2() {
        //2.Необходимо вывести на экран числа от 5 до 1.
        for (int y = 5; y >= 1; y--) {
            System.out.print(y + " ");
        }
    }

    private static void task3() {
        //3.Необходимо вывести на экран таблицу умножения на 3.
        int k = 3;
        for (int z = 1; z <= 10; z++) {
            System.out.println("k * " + z + " = " + k * z);
        }
    }

    private static void task4() {
        //4.С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100 включительно.
        int c = 2;
        while (c <= 100) {
            if (c % 2 == 0)
                System.out.println(c);
            c += 1;
        }
    }

    private static void task5() {
        //5. С помощью оператора while напишите программу определения суммы всех нечетных чисел в диапазоне от 1 до 99 включительно.
        int t = 1;
        int sum = 0;
        while (t <= 99) {
            sum += t;
            t += 2;
            System.out.println("сумма нечетных чисел: " + sum);

        }
    }

    private static void task6() {
        //6. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    private static void task7() {
        //7. Вычислить значения функции на отрезке [а,b] c шагом h
        double a = -4.0;
        double b = 5.0;
        double h = 1.0;
        double y;
        for (double x = a; x <= b; x += h) {
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println(" y = " + y + " при " + " x = " + x);
        }
    }

    private static void task8() {
        //7. Вычислить значения функции на отрезке [а,b] c шагом h.
        int a = -3;
        int b = 4;
        int h = 2;
        int c = 8;
        int y;
        for (int x = a; x <= b; x += h) {
            if (x == 15) {
                y = (x + c) * 2;
            } else {
                y = (x - c) + 6;
            }

        }
    }

    private static void task9() {
        //9. Найти сумму квадратов первых ста чисел.
        int a = 1;
        int sum = 0;
        while (a <= 100) {
            sum += a * a;
            a++;
        }
        System.out.println("Сумма квадратов первых ста чисел " + sum);
    }

    private static void task10() {
        //10. Составить программу нахождения произведения квадратов первых двухсот чисел.
        int b = 2;
        BigInteger c = BigInteger.valueOf(1);
        while (b <= 200) {
            c = c.multiply(BigInteger.valueOf((long) b * b));
            b++;
        }
        System.out.println("Произведение квадратов первых двухсот чисел " + c);
    }
}






