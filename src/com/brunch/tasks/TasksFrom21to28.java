package com.brunch.tasks;

import java.util.Scanner;
import java.lang.Math;


public class TasksFrom21to28 {
    public static void main(String[] args) {
        task21();
        task22();
        task23();
        task24();
        task25();
        task26();
        task27();
        task28();
    }

    private static void task21() {
        //"21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка?Введи Д или М». В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!»
        System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
        char answer = 'М';
        System.out.println(answer);
        switch (answer) {
            case 'Д':
                System.out.println("Мне нравятся девочки!");
                break;
            case 'М':
                System.out.println("Мне нравятся мальчики!");
                break;
            default:
                System.out.println("Неверное значение");
        }
    }

    private static void task22() {
        //Перераспределить значения переменных x и y так, чтобы в x оказалось большее из этих значений, а в y – меньшее
        Scanner sc = new Scanner(System.in);
        System.out.println("task22 >> ");// я не совсем поняла, как решить этот таск
        int x = sc.nextInt();
        int y = sc.nextInt();
        int x1;
        int y1;
        if (x > y) {
            x1 = x + y;
            y1 = x - y;
            System.out.println("Переменная x = " + x1 + " больше значений x и y, а переменная y = " + y1 + " меньше");
        } else {
            System.out.println("Неверное значение");
        }
    }

    private static void task23() {
        //Определить правильность даты, введенной с клавиатуры (число – от 1 до 31, месяц – от 1 до 12). Если введены некорректные данные, то сообщить об этом.
        Scanner sc = new Scanner(System.in);
        System.out.println("task23 >> ");
        System.out.println("Введите число от 1 до 31 ");
        int data = sc.nextInt();
        System.out.println("Введите месяц от 1 до 12");
        int month = sc.nextInt();

        if (month <= 0 || month > 12) {
            System.out.println("Неверно введен месяц!");
        }

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Месяц " + month + " дней в этом месяце 31");
        } else if (data > 31) {
            System.out.println("error");
        }

        if (month == 2) {
            System.out.println("Месяц " + month + " дней в этом месяце 28");
        } else if (data > 28) {
            System.out.println("error");
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("Месяц " + month + ", дней в этом месяце 30");
            } else if (data > 30) {
                System.out.println("error");
            }
        }


    private static void task24() {
        //Составить программу, определяющую результат гадания на ромашке - "любит - не любит", взяв за исходное данное кол-во лепестков n.
        Scanner sc = new Scanner(System.in);
        System.out.println("task24 >> ");
        int n = sc.nextInt();
        System.out.println("Число " + n + " значит, что " + " ");
        if (n % 2 == 0) {
            System.out.println("любит");
        } else {
            System.out.println("не любит");
        }
    }

    private static void task25() {
        //Напишите программу-модель анализа пожарного датчика в помещении, которая выводит сообщение «Пожарная ситуация», если температура в комнате превысила 60°С.
        Scanner sc = new Scanner(System.in);
        int degree = sc.nextInt();
        System.out.println("task25 >> ");
        System.out.println("Модель анализа пожарного датчика в помещении");
        if (degree > 60) {
            System.out.println("Пожарная ситуация");
        } else {
            System.out.println("Температура в предельно допустимом значении");
        }
    }

    private static void task26() {
        //26.Написать программу нахождения суммы большего и меньшего из трех чисел
        Scanner sc = new Scanner(System.in);
        System.out.println("task26 >> ");
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num > num2 && num > num3) {
            System.out.println(num + " - " + " максимальное из трёх чисел");
        } else if (num < num2 && num < num3) {
            System.out.println(num + " - " + " минимальное из трёх чисел");
        }
        if (num2 > num && num2 > num3) {
            System.out.println(num2 + " - " + " максимальное из трёх чисел");
        } else if (num2 < num && num2 < num3) {
            System.out.println(num2 + " - " + " минимальное из трёх чисел");
        }
        if (num3 > num2 && num3 > num) {
            System.out.println(num3 + " - " + " максимальное из трёх чисел");
        } else if (num3 < num2 && num3 < num) {
            System.out.println(num3 + " - " + " минимальное из трёх чисел");
        }
    }

    private static void task27() {
        //Найти max{min(a,b), min(c,d)}.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int minNumber = Math.min(a, b);
        if (a < b) {
            a = minNumber;
            System.out.println("Between a and b , min - " + a);
        } else {
            b = minNumber;
            System.out.println("Between a and b , min - " + b);
        }
        int c = sc.nextInt();
        int d = sc.nextInt();
        int minNumber1 = Math.min(c, d);
        if (c < d) {
            c = minNumber1;
            System.out.println("Between a and b , min - " + c);
        } else {
            d = minNumber1;
            System.out.println("Between a and b , min - " + d);
        }
        System.out.println("max{min(" + a + ", " + b + "), min(" + c + ", " + d + ")} = " + (a < b ? c : d));
    }

    private static void task28() {
        //Даны три числа a,b,c. Определить какое из них равно d. Если ни одно из них не равно d, то найти max(d-a,d-b,d-c)
        int a = 2;
        int b = 12;
        int c = 7;
        int d = 7;
        System.out.println("Даны три числа a,b,c. Определить какое из них равно d.");
        if (a == d) {
            System.out.println(a + " = " + d);
        } else if (a > d) {
            System.out.println("max - " + a);
        } else
            System.out.println("max - " + d);
        if (b == d) {
            System.out.println(b + " = " + d);
        } else if (b > d) {
            System.out.println("max - " + b);
        } else
            System.out.println("max - " + d);
        if (c == d) {
            System.out.println(c + " = " + d);
        } else if (c > d) {
            System.out.println("max - " + c);
        } else
            System.out.println("max - " + d);
    }
}


