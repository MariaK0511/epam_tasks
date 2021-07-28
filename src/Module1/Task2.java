package Module1;

public class Task2 {
    //2. Найдите значение функции: с = 3 + а
    public static void main(String[] args) {
        int a = 65;
        int c = 3 + a;
        System.out.println("Значение функции" + " " + c);
        task3();
    }

    // 3. Найдите значение функции:  z = ( (a – 3 ) * b / 2) + c.
    private static void task3() {
        double a = 9.0;
        double b = 12.0;
        double c = 8.0;
        double z;
        z = ((a - 3) * b / 2) + c;
        System.out.println("Значение функции при а =" + a + " при b = " + b + " при c = " + c + " равно " + z);
    }
}