package Module3;

import java.util.Scanner;

public class TasksFrom21to30 {
    public static void main(String[] args) {
        task21();
        // task24();
        task25();
        task26();
        task27();
        task28();
        task29();
        task30();
    }

    private static void task21() {
        //21. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h.
        // Результат представить в виде таблицы, первый столбец которой – значения аргумента,
        //второй - соответствующие значения функции F(x) = x − sin(x).
        int a = 0;
        int b = 7;
        double h = 0.2;
        double f;
        for (double x = a; x <= b; x += h) {
            f = x - Math.sin(x);
            System.out.printf("x=%f; f=%f \n ", x, f);
        }
    }

    private static void task24() {
        //24. Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
        //Пробразовать его в другое число, цифры которого будут следовать в обратном порядке по
        //сравнению с введенным числом. NOT UNDERSTAND!!!!!!!!
        int n = 1234567;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
            System.out.println(sum + " ");
        }
    }

    private static void task25() {
        //25. Требуется определить факториал числа, которое ввел пользователь.
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int f = 1;
        if (num == 0) {
            f = 1;
        } else {
            for (int i = 1; i <= num; i++) {
                f *= i;
            }
        }
        System.out.println("Факториал числа " + num + " равен " + f);
    }

    private static void task26() {
        //26. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера (Таблицу ASCII).
        System.out.print("ASCII символы и коды:\n № символ OCT  HEX\n");
        for (int i = 33; i < 256; i++) {
            char ch = (char) i;
            String tempOct = Integer.toOctalString(i);
            String tempHex = Integer.toHexString(i);
            System.out.printf("%03d %3s %5s %4s%n", i, ch, tempOct, tempHex);
        }
    }

    private static void task27() {
        //Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
        System.out.print("Введите числа: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (m == 2) {
            m++;
        }
        for (int i = m; i <= n; i++) {
            for (int divisors = 2; divisors < i; divisors++) {
                if (i % divisors == 0) {
                    System.out.print(i + ", ");
                    System.out.print("are divisors of " + divisors);
                }
            }

        }
    }

    private static void task28() {
        //написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *).
        // Вычислить результат Z в зависимости от знака.
        // Предусмотреть реакции на возможный неверный знак операции, а также на ввод Y=0 при делении.
        // Организовать возможность многократных вычислений без перезагрузки программа (т.е. построить цикл).
        // В качестве символа прекращения вычислений принять ‘0’.
        System.out.println("Введите числа: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z;
        System.out.print("Введите знак: ");
        char sign = sc.next().charAt(0);
        while (sign == '/' || sign == '*' || sign == '+' || sign == '-') {
            System.out.println("знак " + sign);
            if (sign == '+') {
                z = x + y;
                System.out.println("result: " + z);
                break;
            } else if (sign == '-') {
                z = x - y;
                System.out.println("result: " + z);
                break;
            } else if (sign == '/') {
                z = x / y;
                System.out.println("result: " + z);
                break;
            } else if (sign == '*') {
                z = x * y;
                System.out.println("result: " + z);
                break;
            } else if (sign == '/' && sign == 0) {
                System.out.println("error");
                break;
            }
            if (sign != '/' || sign != '*' || sign != '+' || sign != '-') {
                System.out.println("Wrong sign!");
                break;
            }
            if (sign == 0) {
                break;
            }
        }
        sc.close();
    }

    private static void task29() {
        //29.Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
        int num1 = 6173825;
        int num2 = 67871;
        for (int n = 0; num1 > 0; num1 /= 10) {
            int digit1 = num1 % 10;
            for (int n2 = num2; n2 > 0; n2 /= 10) {
                // Get a digit from num2
                int digit2 = n2 % 10;
                // compare
                if (digit1 == digit2) ;
                System.out.println(digit1);

            }

        }
    }

    private static void task30() {
        //30. Написать программу, переводящую римские цифры в арабские.

    }
}




