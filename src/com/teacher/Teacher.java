package com.teacher;

import java.util.Scanner;

public class Teacher {
    public static void main(String[] args) {

        System.out.print("Input a hour and minutes: ");
        Scanner times = new Scanner(System.in);

        int hours = times.nextInt();
        int minutes = times.nextInt();
        times.close();

        if (hours < 0 || hours > 24) {
            System.out.println("Вы ввели неверные часы");
            return; }
        else if (minutes < 0 || minutes > 60) {
            System.out.println("Вы ввели не верно минуты");
            return;
        }

        System.out.printf("Указанное Вами время: %d:%d", hours, minutes);
    }
}