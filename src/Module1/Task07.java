package Module1;

public class Task07 {
    //7. Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника
    public  static void main(String [] args) {
        int length = 8;
        int width = length / 2;
        int S = length * width;

        System.out.println("При width = " + width  + " length = " + length + " S = " + S );
    }
}
