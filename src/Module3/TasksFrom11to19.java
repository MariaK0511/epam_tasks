package Module3;

public class TasksFrom11to19 {
    public static void main(String[] args) {
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task18();
        task19();

    }

    private static void task11() {
        //11. Составить программу нахождения разности кубов первых двухсот чисел
        int difference = 0;
        for (int d = 1; d <= 200; d++) {
            difference -= Math.pow(d, 3);
        }
        System.out.println("Разность кубов первых двухот чисел " + difference);
    }

    private static void task12() {
        //12. Последовательность аn строится так: а1 = 1, an =6 + аn-1 , для каждого n > 1 Составьте программу нахождения произведения первых 10 членов этой последовательности
        long composition = 1;
        int an = 1;
        for (int a1 = 2; a1 <= 10; a1++) {
            an = 6 + an;
            composition *= an;
        }
        System.out.println("Программа нахождения произведения первых 10 членов  последовательности " + composition);
    }

    private static void task13() {
        //13. Составить таблицу значений функции y = 5 - x^2 / 2 на отрезке [-5; 5] с шагом 0.5.
        int a = -5;
        int b = 5;
        double h = 0.5;
        double y;
        for (double x = a; x <= b; x += h) {
            y = 5 - (x * x) / 2.0;
            System.out.println("При х = " + x + " у = " + y);
        }
    }

    private static void task14() {
        //14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
        double sum = 0;
        for (double n = 1; n <= 3; n++) {
            sum += 1 / n;
        }
        System.out.println(sum);
    }

    private static void task15() {
        //15. Вычислить : 1+2+4+8+...+ 2 в 10 степени.
        int sum = 0;
        for (int a = 1; a <= 10; a++) {
            sum += Math.pow(a, 10);
        }
        System.out.println(sum);
    }

    private static void task16() {
        //16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
        int sum = 1;
        int composition = sum;
        for (int a = 4; a <= 10; a++) {
            sum += a;
            composition *= sum;
        }
        System.out.println(composition);
    }


    private static void task18() {
        //18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
        double e = 0.5;
        double sum = 0;
        int n = 3;
        double an;

        for (int i = 1; i < n; i++) {
            an = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(an) >= e) {
                sum += an;
            }
        }
        System.out.println("Сумма членов ряда, модуль которых больше или равен " + e + " = " + sum);
    }

    private static void task19() {
        //19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
        double e = 0.2;
        double sum = 0;
        int n = 10;
        double a;
        for (int i = 1; i <= n; i++) {
            a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(a) >= e) {
                sum += a;
            }
        }
        System.out.println("Сумма членов ряда, модуль которых больше или равен " + e + " = " + sum);
    }
}