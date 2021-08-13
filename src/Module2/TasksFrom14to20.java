package Module2;

import java.util.Scanner;

public class TasksFrom14to20 {
    public static void main(String[] args) {
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
    }

    private static void task14() {
        //Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
        int corner1 = 60;
        int corner2 = 90;
        int corner3 = 180 - (corner1 + corner2);
        if (corner1 + corner2 < 180) {
            System.out.println("Такой треугольник существует");
        } else if (corner1 == 90 || corner2 == 90 || corner3 == 90) {
            System.out.println("Такой треугольник является прямоугольным");
        } else {
            System.out.println("Такого треугольника не существет");
        }
    }

    private static void task15() {
        //15. Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.
        int x = 12;
        int y = 14;
        int newX;
        int newY;
        if (x > y) {
            newX = (x + y) / 2;
            newY = (x * y) * 2;
        } else {
            newY = (x + y) / 2;
            newX = (x * y) * 2;
        }
        System.out.println("Числа " + x + " " + y + " заменены на " + newX + " " + newY);
    }

    private static void task16() {
        //16. На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком координатном угле).
        double x = 1.2;
        double y = -1.2;
        if (x == 0 && y == 0) {
            System.out.println("Точка А расположена в начале координат (" + x + " ," + y + ")");
        } else if (x == 0 && y != 0) {
            System.out.println("Точка А расположена на оси y");
        } else if (x != 0 && y == 0) {
            System.out.println("Точка А расположена на оси x");
        } else if (x > 0 && y > 0) {
            System.out.println("Точка А расположена в первой четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка А расположена во второй четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка А расположена в третьей четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка А расположена в четвертой четверти");
        }
    }

    private static void task17() {
        //17. Даны целые числа m, n. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему из исходных, а если равны, то заменить числа нулями.
        Scanner sc = new Scanner(System.in);
        System.out.println("task17 >> ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (m != n) {
            if (m > n) {
                n = m;
            } else {
                m = n;
            }
        } else if (m == n) {
            m = 0;
            n = 0;
        }
        System.out.println("Получены числа " + m + " и " + n);
    }

    private static void task18() {
        //18. Подсчитать количество отрицательных среди чисел а, b, с
        Scanner sc = new Scanner(System.in);
        System.out.println("task18 >> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;
        if (a < 0) {
            count++;
        }
        if (b < 0) {
            count++;
        }
        if (c < 0) {
            count++;
        }
        System.out.println("Отрицательных чисел " + count);
    }

    private static void task19() {
        //18. Подсчитать количество положительных среди чисел а, b, с
        Scanner sc = new Scanner(System.in);
        System.out.println("task19 >> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;
        if (a > 0) {
            count++;
        }
        if (b > 0) {
            count++;
        }
        if (c > 0) {
            count++;
        }
        System.out.println("Положительных чисел " + count);
    }

    private static void task20() {
        //20. Определить, делителем каких чисел а, b, с является число k.
        int a = 12;
        int b = 22;
        int c = 39;
        int k = 3;
        if (a % k == 0) {
            System.out.println(k + "является делителем " + a);
        }
        if (b % k == 0) {
            System.out.println(k + "является делителем " + b);
        }
        if (c % k == 0) {
            System.out.println(k + "является делителем " + c);
        }
    }
}
