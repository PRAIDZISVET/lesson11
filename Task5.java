package com.itacademy.lesson11;

public class Task5 {
    public static void main(String[] args) {

        try {
            customCheck();
        } catch (CustomException e){
            System.out.println("Отловили CustomException");
        }
    }
    private static void customCheck ()  {
        try {
            int value = 0;
            test(value);
        } catch (IllegalArgumentException e) {
            throw new CustomException(e);
        }
    }
    private static void test (int value) {
        if (value == 0) {
            throw new IllegalArgumentException("Value is not correct");
        }
    }
}
