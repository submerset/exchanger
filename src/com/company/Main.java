package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double amount, result = null;
        String currency = "USD";

        Exchanger exchanger = new Exchanger((double) 26);

        System.out.println("Выбрать");
        System.out.println("1. USD -> UAH");
        System.out.println("2. UAH -> USD");

        int direction = scanner.nextInt();
        System.out.println("Текущий курс за 1 USD " + exchanger.getUsdCost());
        System.out.println("Cумма?");

        amount = scanner.nextDouble();


        switch (direction) {
            case 1:
                result = exchanger.exhageFromUsd(amount);
                currency = "UAH";
                break;

            default:
                result = exchanger.exhageFromUah(amount);
                break;

        }

        System.out.println("Резульат:" + result + " " + currency);
    }
}
