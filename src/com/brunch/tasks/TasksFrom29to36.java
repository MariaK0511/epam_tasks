package com.brunch.tasks;

import java.util.Scanner;

public class TasksFrom29to36 {
    public static void main(String[] args) {
        task29();
        task30();
        task31();
        task32();
        task33();
        task34();
        task35();
        task36();

    }


    private static void task29() {
        //29.Даны три точки А(х1,y1), B(x2,y2) и C(x3,y3). Определить, будут ли они расположены на одной прямой.
        double x1 = 2.0;
        double y1 = -0.7;
        double x2 = 1.0;
        double y2 = -2.5;
        double x3 = 0.9;
        double y3 = 1.5;
        if ((x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1)) {
            System.out.printf("Точки A(%.2f; %.2f), B(%.2f; %.2f) и С(%.2f; %.2f) лежат на одной прямой", x1, y1, x2, y2, x3, y3);
        } else {
            System.out.printf("Точки A(%.2f; %.2f), B(%.2f; %.2f) и С(%.2f; %.2f) не лежат на одной прямой",
                    x1, y1, x2, y2, x3, y3);
        }
    }

    private static void task30() {
        //30.Даны действительные числа а,b, с. Удвоить эти числа, если a>b>c, и заменить их абсолютными значениями, если это не так.
        Scanner sc = new Scanner(System.in);
        System.out.println(" task30 >> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && b > c) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            System.out.println(Math.abs(a));
            System.out.println(Math.abs(b));
            System.out.println(Math.abs(c));
        }
        System.out.println("a = " + a + " b = " + b + " c = " + c);
    }

    private static void task31() {
        //31.Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича. Определить, пройдет ли кирпич через отверстие
        Scanner sc = new Scanner(System.in);
        System.out.println("task31 >> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Введите размеры кирпича");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if ((x <= a || x <= b) && (y <= a || y <= b) && (z <= a || z <= b)) {
            System.out.println("Кирпич пройдёт через отверстие");
        } else {
            System.out.println("Кирпич не пройдёт через отверстие");

        }
    }

    private static void task32() {
        //Написать программу, которая по заданным трем числам определяет, является ли сумма каких-нибудь двух из них положительной.
        Scanner sc = new Scanner(System.in);
        System.out.println("task322 >> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a + b > 0) || (b + c > 0) || (a + c > 0)) {
            System.out.println("Сумма двух представленных чисел является положительной.");
        } else {
            System.out.println("Положительной суммы из двух представленных чисел нет.");
        }
    }

    private static void task33() {
        //33.Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации в базе данных.
        // Доступ к базе имеют только шесть человек, разбитых на 3 группы по степени доступа. Они имеют следующие пароли: 9583, 1747-доступы модули баз A. B. C;
        // 333, 7992- доступны модули баз B, C; 9455, 8997- доступы модуль баз к C.
        System.out.println("Программа уровня доступа к секретной информации");

        int password = 9583;
        int password2 = 1747;
        int password3 = 333;
        int password4 = 7992;
        int password5 = 9455;
        int password6 = 8997;
        if (password == 9583 && password2 == 1747) {
            System.out.println("Access granted to: A, B, C");
        } else if (password3 == 333 && password4 == 7992) {
            System.out.println("Access granted to: B, C");
        } else if (password5 == 9455 && password6 == 8997) {
            System.out.println("Access granted to: C");
        }
    }

    private static void task34() {
        //Составить программу, реализующую эпизод применения компьютера в магазине.
        // Компьютер запрашивает стоимость покупки и сумму денег, внесенную покупателем.
        // Если сдачи не требуется, печатает на экране «Спасибо за покупку», если денег занесено больше, то печатает «Возьмите сдачу» и указывает сумму сдачи,
        // если денег недостаточно,то печатает соответствующее сообщение и указывает размер недостающей суммы.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стоимость покупки: ");
        int priceOfPurchase = sc.nextInt();
        System.out.println("Введите сумму денег: ");
        int money = sc.nextInt();
        int change = money - priceOfPurchase;
        if (priceOfPurchase == money) {
            System.out.println("Спасибо за покупку");
        } else if (priceOfPurchase < money) {
            System.out.println("Возьмите сдачу " + change);
        } else if (priceOfPurchase > money) {
            System.out.println("Недостаточно денег");
        }
    }

    private static void task35() {
        //36.Вычислить значение функции.
        double x = 2.3;
        double f;
        if (x >= 8) {
            f = -Math.pow(x, 2) + x - 9;
        } else {
            f = 1 / (Math.pow(x, 4) - 6);
        }
    }

    private static void task36() {
        //36.Вычислить значение функции.
        double x = 0.1;
        double f;
        if (x <= 3) {
            f = Math.pow(x, 2) - 3 * x + 9;
        } else {
            f = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println("Значение функции при x = " + x + " равно " + f);
    }
}

