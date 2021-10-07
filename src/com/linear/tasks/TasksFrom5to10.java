package com.linear.tasks;

public class TasksFrom5to10 {
    public static void main(String[] args) {
        task7();
        task8();
        task9();
        task10();
    }

    private static void task7() {
        //7. Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника

        int length = 8;
        int width = length / 2;
        int S = length * width;
        System.out.println(" S = " + S);
    }

    private static void task8() {
        //8. Вычислить значение выражения по формуле (все переменные принимают действительные значения)
        int a = 3;
        int b = 2;
        int c = 1;
        double result1 = (b + Math.sqrt(b * b + 4 * a * c));
        double result2 = result1/ (2 * a);
        double result3= result2 - ((Math.pow(a, 3) * c) + Math.pow(b, -2));
        System.out.println("Значение выражения: " + result3);
    }

    private static void task9() {
        //9. Вычислить значение выражения по формуле (все переменные принимают действительные значения)
        double a = 3.0;
        double b = 4.0;
        double c = 1.5;
        double d = 0.5;
        double result = (a / c) * (b / d) - ((a * b - c) / (c * d));
        System.out.println("Значение выражения: " + result);
    }

    private static void task10() {
        /*10. Вычислить значение выражения по формуле(все переменные принимают действительные значения):
        (𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 y) / (𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦)  * tg xy */
        double x = 60;
        double y = 60;
        double xRad = x * Math.PI / 180.0;
        double yRad = y * Math.PI / 180 / 0;
        double result = (Math.sin(xRad) + Math.cos(yRad) / (Math.cos(xRad) - Math.sin(yRad)) * Math.tan(xRad * yRad));
        System.out.println("Значение выражения: " + result);
    }
}