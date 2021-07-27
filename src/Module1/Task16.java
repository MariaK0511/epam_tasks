package Module1;

public class Task16 {
    // не поняла
    //Найти произведение цифр заданного четырехзначного числа.
    public static void main(String[] args){

        int number = 1230;
        int composition = 1;

        while (number > 0){
            composition = composition * (number % 10);
            number = number / 10;
        }
        System.out.println("произведение чисел"  + composition + "*" + number + "=" + composition);

    }
    private static void task17() {
        //17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел
        //not understand
        double number1 = 2.4;
        double number2 = -5.8;

        double avgArithmetic = (Math.pow(number1, 3) + Math.pow(number2, 3)) / 2;
        double avgGeometric = Math.sqrt(Math.abs(number1) * Math.abs(number2));

        System.out.println("Среднее арифметическое кубов чисел равно " + avgArithmetic);
        System.out.println("Среднее геометрическое модулей чисел равно " + avgGeometric);
        System.out.println();
    }
    private static void task18(){
        //18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.
        double length = 5.6;
        double s1 = length * length;
        double s2 = s1 * 6;
        double v = Math.pow(length, 3);
        System.out.println("S грани = " + s1 );
        System.out.println("S поверхности =" + s2 );
        System.out.println("V = " + v);
    }
    private static  void task19() {
        //19. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.
        double a = 3.0;
        double s = (a * a * Math.sqrt(3)) / 4;
        double h = (a * Math.sqrt(3)) / 2;
        double r1 = a / Math.sqrt(3) / 6;
        double r2 = a * Math.sqrt(3) / 3;
        System.out.println("Площадь треугольника равна " + s);
        System.out.println("Высота равна " + h);
        System.out.println("Радиус вписанной окружности равен " + r1);
        System.out.println("Радиус описанной окружности равен " + r2);
    }

    private static  void  task20(){
        //20. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
        double length = 6.29;

        double r = length / (2 * Math.PI);
        double s = Math.PI * r * r;

        System.out.println("Для круга с R = " + r + " длина окружности равна " + length + ", площадь круга равна " + s);
    }

}

