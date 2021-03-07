package com.itacademy.lesson11;

public class Task3Or4 {
    public static void main(String[] args) {

        checkCustomException(0);
    }
    private static void checkCustomException (int value) {
        try {
            if (value == 0) {
                CustomException exception = new CustomException("My exception message");
                throw exception;
            }
        } catch (CustomException e) {
            e.printStackTrace();
        }

    }
}
