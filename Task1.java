package com.itacademy.lesson11;

public class Task1 {
    public static void main(String[] args) {
        String value = null;
        try {
            checkValue(value);
        } catch (NullPointerException e) {
            System.out.println("Переменная value == 0");
        }
    }

    private static void checkValue (String value) {
       int number = value.toCharArray().length;
        System.out.println(number);
    }
}
