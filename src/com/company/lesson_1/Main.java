package com.company.lesson_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Выбирите систему счисления:");
        System.out.println("1. Двоичная");
        System.out.println("2. Восьмиричная");
        System.out.println("3. Десятичная");
        System.out.println("4. Шеснадцатиричная");

        int index = new Scanner(System.in).nextInt();
        if (index == 1)
            System.out.println("В двоичной системе оно будет таким: " + Integer.toBinaryString(n));
        if (index == 2)
            System.out.println("В восьмиричной системе оно будет таким: " + Integer.toOctalString(n));
        if (index == 4)
            System.out.println("В шестнацатиричной системе оно будет таким: " + Integer.toHexString(n));
        else
            System.out.println("Ваша число равно: " + n);
        int x = Integer.parseInt("c6", 16);
        System.out.println("Ваша число равно: " + x);

    }
}
