package Module1;

public class Task28 {
    private static void task28(){
        //28. Составить программу перевода радианной меры угла в градусы, минуты и секунды.");

        double initRad = 0.12;
        double initDegr = initRad * 180 / Math.PI;

        int degrees = (int) initDegr;

        double temp = (initDegr - degrees) * 60;
        int minutes = (int) temp;

        double seconds = (temp - minutes) * 60;

        System.out.println("Исходная мера угла в радианах: " + initRad);
        System.out.println(degrees + " гр. " + minutes + " мин. " + seconds + " c.");
        System.out.println();
    }
    private static void task32(){
        System.out.println("32. Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). Какое время будут показывать часы через р ч q мин r с?");

        int hoursCurrent = 23;
        int minutesCurrent = 23;
        int secondsCurrent = 14;

        int hoursInterval = 23;
        int minutesInterval = 59;
        int secondsInterval = 59;

        int currentInSeconds = hoursCurrent * 3600 + minutesCurrent * 60 + secondsCurrent;
        int intervalInSeconds = hoursInterval * 3600 + minutesInterval * 60 + secondsInterval;

        int finalInSeconds = currentInSeconds + intervalInSeconds;

        int hoursFinal = (finalInSeconds / 3600);

        int temp = finalInSeconds - (hoursFinal * 3600);
        int minutesFinal = temp / 60;

        int secondsFinal = temp - (minutesFinal * 60);

        int hours24Format = 0;
        if (hoursFinal > 23){
            temp = (hoursFinal / 24);
            hours24Format = hoursFinal - temp * 24;
        }
        else {
            hours24Format = hoursFinal;
        }

        System.out.println("Сейчас: " + hoursCurrent + " ч. " + minutesCurrent + " мин. " + secondsCurrent + " c.");
        System.out.println("Через: " + hoursInterval + " ч. " + minutesInterval + " мин. " + secondsInterval + " c.");
        System.out.println("Будет: " + hours24Format + " ч. " + minutesFinal + " мин. " + secondsFinal + " c.");
        System.out.println();
    }

}
