package com.itacademy.lesson11;

import java.util.List;

public class ExceptionDemo {
    public static void main(String[] args) throws Exception {
//        List<Integer> list = null;
//        try {
//            handle(list);
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("Finally!!!");
//        }
        try {
            doSmth(0);
        } finally {
            System.out.println("finally main");
        }
    }

    private static int doSmth (int value) {
       try {
           if (value == 0) {
               throw new IllegalArgumentException("Входной параметр value == 0");
           }
       } catch (IllegalArgumentException e) {
           e.printStackTrace();
       } finally {
           System.out.println("finally doSmth");
       }
        return 1;
    }

    private static void handle (List<Integer> list) throws Exception {
        if (list == null || list.size() < 1) {
            throw new Exception("Лист прошел пустой либо null!");
        }
        System.out.println(list.size());
    }
}
