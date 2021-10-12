package Module3;

import java.util.Scanner;

public class TaskFrom31to40 {
    public static void main(String[] args) {
        task31();
    }

    private static void task31() {
        //Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно.
        // Человек пытается их угадать.
        // Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала программа,
        // а также ошибочные числа пользователя.
        System.out.println("task31");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive integers from 1 to 15: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();

        final int min = 1; // Минимальное число для диапазона
        final int max = 15; // Максимальное число для диапазона

        for (int i = 0; i < 5; i++) {
            int myRandom = rnd(min, max);
            System.out.println("Computer number = " + myRandom);
            if (num1 == myRandom) {
                System.out.println("right num " + num1);

                continue;
            }
            if (num2 == myRandom) {
                System.out.println("right num " + num2);
                continue;
            }
            if (num3 == myRandom) {
                System.out.println("right num " + num3);
                continue;
            }
            if (num4 == myRandom) {
                System.out.println("right num " + num4);
                continue;
            }
            if (num5 == myRandom) {
                System.out.println("right num " + num5);
                continue;
            }
            System.out.println("we don't guess computer number " + myRandom);
        }
    }

    /**
     * Метод получения псевдослучайного целого числа от min до max (включая max);
     */
    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }


}
