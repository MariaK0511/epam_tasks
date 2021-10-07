package com.linear.tasks;

public class Task11 {
    public static void main(String[] args) {
        // 11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.
        double a = 4.0;
        double b = 6.0;
        double c = Math.sqrt(a * a + b * b); //гипотенузу ищем
        double p = a + b + c;
        double s = a * b / 2;
        System.out.println("Прямоугольный треугольник с катетами a = " + a + " и b = " + b);
        System.out.println("Площадь треугольника P = " + p);
        System.out.println("Периметр треугольника S = " + s);
    }
}
