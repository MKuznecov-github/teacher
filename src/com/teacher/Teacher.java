package com.teacher;

import java.util.Scanner;

public class Teacher {
    public static void main(String[] args) {

        System.out.print("Введите часы и минуты: ");
        Scanner times = new Scanner(System.in);

        int hours = times.nextInt();
        int minutes = times.nextInt();
        times.close();

        int time = hours * 100 + minutes;

        String result = " - Вы ввели не верное время";
        if (time < 0 || time > 2400) {
            System.out.println(result);
            return;
        }

        System.out.printf("Указанное Вами время: %d:%d", hours, minutes);

        String work = " - Не рабочее время Преподавателя.";
        if (time <= 1000 || time >= 2000) {
            System.out.println(work);
        }

            String result1 = " - Преподаватель свободен";

            if (time >= 1030 && time <= 1200) {
                result1 = " - Преподаватель занят";
            } else if (time >= 1340 && time <= 1500) {
                result1 = " - Преподаватель занят";
            } else if (time >= 1800 && time <= 1930) {
                result1 = " - Преподаватель занят";
            }
            System.out.println(result1);
    }
}
