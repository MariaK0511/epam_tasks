package Module1;

// Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае
public class Task37 {
    //not understand
    public static void task37() {
        int n1 = 22;
        if (n1 / 100 == 0 && n1 % 2 == 0) {
            System.out.print("True: ");
        } else {
            System.out.print("False: ");
        }
        System.out.println("Целое число " + n1 + " является четным двузначным числом.");
    }
}