package com.teacher;

import java.util.Scanner;

public class Teacher {
    public static void main(String[] args) {

        System.out.print("Введите часы и минуты: ");
        Scanner times = new Scanner(System.in);

        int hours = times.nextInt();
        int minutes = times.nextInt();
        times.close();


        if (hours < 0 || hours > 24) {
            System.out.println("Вы ввели неверные часы");
            return;
        } else if (minutes < 0 || minutes > 60) {
            System.out.println("Вы ввели не верно минуты");
            return;
        }

        System.out.printf("Указанное Вами время: %d:%d", hours, minutes);

        int time = hours * 100 + minutes;

        if (time >= 1030 && time <= 1200) {
            System.out.println(" - Преподаватель занят.");
            return;
        } else if (time >= 1340 && time <= 1500) {
            System.out.println(" - Преподаватель занят.");
            return;
        } else if (time >= 1800 && time <= 1930) {
            System.out.println(" - Преподаватель занят.");
            return;
        }
        System.out.println(" - Преподаватель свободен.");
        return;
    }
    }
