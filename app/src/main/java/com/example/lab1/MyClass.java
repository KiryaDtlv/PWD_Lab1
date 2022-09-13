package com.example.lab1;

/**
 * Класс продукции со свойствами <b>maker</b> и <b>price</b>.
 * @autor Кирилл Дятлов, Артём Макаров
 * @version 1.0
 */
public class MyClass {
    /**
     * Функция получения минимального значения из массива
     * @param mas - массив значений
     * @return возвращает минимальное значение массива
     */
    public static int min(int[] mas) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mas.length; i++) {
            min = mas[i] < min ? mas[i] : min;
        }
        return min;
    }
    /**
     * Функция получения максимального значения из массива
     * @param mas - массив значений
     * @return возвращает максимальное значение массива
     */
    public static int max(int[] mas) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < mas.length; i++) {
            max = mas[i] > max ? mas[i] : max;
        }
        return max;
    }
}
