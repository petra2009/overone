package com.company.lesson_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите количество дней: ");
        int days = new Scanner(System.in).nextInt();
        System.out.println("что составит: " + days * 86400 + " секунд");

        System.out.println("Введите диаметр круга: ");

        int d = new Scanner(System.in).nextInt();

        System.out.println("Длина окружности ровна " + (d * Math.PI));

        System.out.println("Введите количество секунд: ");
        int sec = new Scanner(System.in).nextInt();
        days = sec / 86400;
        int hour = (sec - days * 86400) / 3600;
        int min = (sec - hour * 3600 - days * 86400) / 60;
        int sec1 = sec - min * 60 - hour * 3600 - days * 86400;
        System.out.println("Ответ: " + days + " дней " + hour + " часов " + min + " минут " + sec1 + " секунд");
    }
}
