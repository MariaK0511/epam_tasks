package com.linear.tasks;

public class Task28 {
    public static void main(String[] args) {
        //28. Составить программу перевода радианной меры угла в градусы, минуты и секунды.;
        double initRad = 0.12;
        double initGrade = initRad * 180 / Math.PI;
        int degrees = (int) initGrade;
        double temp = (initGrade - degrees) * 60;
        int minutes = (int) temp;
        double seconds = (temp - minutes) * 60;
        System.out.println("Исходная мера угла в радианах: " + initRad);
        System.out.println(degrees + " гр. " + minutes + " мин. " + seconds + " c.");
        System.out.println();
        task32();
    }

    private static void task32() {
        /*"32. Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59)." +
                " Какое время будут показывать часы через р ч q мин r с?");*/
        int hoursCurrent = 23;
        int minutesCurrent = 59;
        int secondsCurrent = 59;
        int hoursInterval = 2;
        int minutesInterval = 5;
        int secondsInterval = 59;
        int currentInSeconds = hoursCurrent * 3600 + minutesCurrent * 60 + secondsCurrent;
        int intervalInSeconds = hoursInterval * 3600 + minutesInterval * 60 + secondsInterval;
        int finalInSeconds = currentInSeconds + intervalInSeconds;
        int hoursFinal = (finalInSeconds / 3600);
        int temp = finalInSeconds - (hoursFinal * 3600);
        int minutesFinal = temp / 60;
        int secondsFinal = temp - (minutesFinal * 60);
        int hours24Format = 24;
        System.out.println("Сейчас: " + hoursCurrent + " ч. " + minutesCurrent + " мин. " + secondsCurrent + " c.");
        System.out.println("Через: " + hoursInterval + " ч. " + minutesInterval + " мин. " + secondsInterval + " c.");
        System.out.println("Будет: " + hours24Format + " ч. " + minutesFinal + " мин. " + secondsFinal + " c.");
    }
}