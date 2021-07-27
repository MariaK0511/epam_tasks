package Module1;

import java.util.Scanner;

//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
public class Task4 {
    public static void main(String[] args) {
        double a = 4.5;
        double b = 3;
        double c = 2;
        double z;

        z = ((a - 3) * b / 2) + c;
        System.out.println("Значение функции z=((a – 3)*b/2) + c при a=" + a + ", b=" + b + ", c=" + c + " равно " + z);

    }
}

