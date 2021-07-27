package Module1;

public class Task1 {
    //1. Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное.

    public static void main (String [] args){
    System.out.println("1. Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное.");

    double a = 2;
    double b = 4;
    double sum = a + b;
        System.out.println("сумма чисел" + a + "+" + b + "=" + sum);

    double difference = b - a;
        System.out.println("разность чисел" + b + "-" + a + "=" + difference);

    double composition = b * a;
        System.out.println("произведение чисел"  + a + "*" + b + "=" + composition);

    double quotient = b / a;
        System.out.println("частное чисел" + b + "/" + a + "=" + quotient);
        System.out.println();



}
}

