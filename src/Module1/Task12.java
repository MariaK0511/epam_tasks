package Module1;

public class Task12 {
    //12. Вычислить расстояние между двумя точками с данными координатами (х1, у1) и (x2, у2).
    public static void main(String[] args) {
        double x1 = 1.2;
        double y1 = 0.5;
        double x2 = -2.2;
        double y2 = 1.0;
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Расстояние между точками (" + x1 + ", " + y1 + ") и (" + x2 + ", " + y2 + ") равно " + length);

    }

    private static void task13(String[] args) {
        //13. Заданы координаты трех вершин треугольника (х1, у1),(х2, у2),(х3, у3). Найти его периметр и площадь.");

        double x1 = 2.0;
        double x2 = 3.0;
        double x3 = 5.0;
        double y1 = 1.0;
        double y2 = 4.0;
        double y3 = 1.0;
        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double p = a + b + c;
        double s = a * b / 2;
        System.out.println("Вершины треугольника a = " + a + " b =" + b + " c = " + c);
        System.out.println("Периметр = " + p);
        System.out.println("Площадь = " + s);
    }

        private static void task14(String[] args) {
        //14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R
            double r = 4.5;
            double length = 2 * Math.PI * r;
            double s = Math.PI * r * r;
            System.out.println("Длина окружности = " + length);
            System.out.println("Площадь круга = " + s);
        }
    private static void task15(){
        //не поняла решение
        //15. Написать программу, которая выводит на экран первые четыре степени числа π.");

        for (int i = 1; i <= 5; i++){
            System.out.println("Pi^" + i + " = " + Math.pow(Math.PI, i));
        }

        System.out.println();
    }
}
