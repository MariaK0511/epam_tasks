package Module2;

import java.util.Scanner;

public class Tasks8and9and10and11and12and13 {
    public static void main(String[] args) {
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
    }

    private static void task8() {
        //8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.
    }

    private static void task9() {
        //9. Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.
        Scanner sc = new Scanner(System.in);
        System.out.println("task9 >> ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        System.out.print(side1 + side2 + side3);
        if (side1 == side2 && side2 == side3) {
            System.out.println(" Треугольник является равносторонним");
        } else {
            System.out.println(" Треугольник не является равновсторонним");
        }

    }

    private static void task10() {
        //10. Составить программу, которая определит площадь какого круга меньше.
        Scanner sc = new Scanner(System.in);
        System.out.println("task10 >> ");
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        if (r1 > r2) {
            System.out.println("Площадь первого круга меньше и равна " + r1);
        } else {
            System.out.println("Площадь второго круга меньше и равна " + r2);
        }
    }

    private static void task11() {
        //11. Составить программу, которая определит площадь какого треугольника больше.
        Scanner sc = new Scanner(System.in);
        System.out.println("task11 >> ");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int s1 = (a1 + b1) / 2;
        int s2 = (a2 + b2) / 2;
        if (s1 > s2) {
            System.out.println("Площадь первого треугольника больше площади второго треугольника " + s1);
        } else if (s1 == s2) {
            System.out.println("Площади первого и второго треугольников равны");
        } else {
            System.out.println("Площадь второго треугольника больше площади первого треугольника " + s2);
        }
    }

    private static void task12() {
        //12. Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.
        Scanner sc = new Scanner(System.in);
        System.out.println("task12 >> ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 > 0) {
            System.out.println(Math.pow(num1, 2));
        } else {
            System.out.println(Math.pow(num1, 4));
        }
        if (num2 > 0) {
            System.out.println(Math.pow(num2, 2));
        } else {
            System.out.println(Math.pow(num2, 4));
        }
        if (num3 > 0) {
            System.out.println(Math.pow(num3, 2));
        } else {
            System.out.println(Math.pow(num3, 4));
        }
    }

    private static void task13() {
        //13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.
        double x1 = 1.2;
        double y1 = 3.0;
        double x2 = -0.4;
        double y2 = 0.2;
        double a = Math.sqrt(x1 * x1 + y1 * y1);
        double b = Math.sqrt(x2 * x2 + y2 * y2);
        if (a > b) {
            System.out.println(" точки ( " + x1 + y2 + " ) ближе к началу координат, чем точки (" + x2 + y2 + ")");
        } else if (a == b) {
            System.out.println(" точки ( " + x1 + y2 + " ) имеют одинаковое расстояние, как точки (" + x2 + y2 + ")");
        } else {
            System.out.println(" точки ( " + x2 + y2 + " ) ближе к началу координат, чем точки (" + x1 + y2 + ")");
        }
    }
}

