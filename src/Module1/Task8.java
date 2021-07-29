package Module1;
import  java.util.Scanner;

public class Task8 {
    //8. Вычислить значение выражения по формуле (все переменные принимают действительные значения)
    public static void main(String[] args) {
        double a = 4.0;
        double b = 3.0;
        double c = 9.0;
        double result = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) + Math.pow(b, -3);
        System.out.println("Значение выражения: " + result);
    }


    private static void task9(){
        //9. Вычислить значение выражения по формуле (все переменные принимают действительные значения)
        double a = 3.0;
        double b = 4.0;
        double c = 1.5;
        double d = 0.5;
        double result = (a / c) * (b / d) - ((a * b - c) / (c * d));
        System.out.println("Значение выражения: " + result);
        }
        private  static  void task10(){
        //10. Вычислить значение выражения по формуле (все переменные принимают действительные значения)
            double x = 60;
            double y = 60;
           // перевод в радианы
            double xRad = x * Math.PI / 180.0;
            double yRad = y * Math.PI / 180/0;
            double result = (Math.sin(xRad) + Math.cos(yRad) / (Math.cos(xRad) - Math.sin(yRad)) * Math.tan(xRad * yRad));
            System.out.println("Значение выражения: " + result);
        }
    }

