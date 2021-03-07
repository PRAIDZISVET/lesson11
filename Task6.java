package com.itacademy.lesson11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Task6 {
    public static final Map<Integer, Exception> EXCEPTIONS = new HashMap<>();
    static {
        EXCEPTIONS.put(0, new CustomException());
        EXCEPTIONS.put(1, new IllegalArgumentException());
        EXCEPTIONS.put(2, new IndexOutOfBoundsException());
    }
    public static void main(String[] args) {

        try {
            randomException();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void randomException () throws Exception {
        Random random = new Random();
        int randomValue = random.nextInt(3);
    throw  EXCEPTIONS.get(randomValue);
    }
}
