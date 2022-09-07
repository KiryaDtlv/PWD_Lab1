package com.example.lab1;

public class MyClass {
    public static int min(int[] mas) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mas.length; i++) {
            min = mas[i] < min ? mas[i] : min;
        }
        return min;
    }

    public static int max(int[] mas) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < mas.length; i++) {
            max = mas[i] > max ? mas[i] : max;
        }
        return max;
    }
}
