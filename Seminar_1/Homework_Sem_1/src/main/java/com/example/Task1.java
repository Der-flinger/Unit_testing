package com.example;

// Задание 1. ** В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки 
// и процент скидки и возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с 
// использованием библиотеки AssertJ. Если метод calculateDiscount получает недопустимые аргументы, 
// он должен выбрасывать исключение ArithmeticException. Не забудьте написать тесты для проверки этого поведения.

import static org.assertj.core.api.Assert.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class Task1 {
    public static void main(String[] args) {

        // double sum = Calculator.calculateDiscount(233, 10);
        // System.out.printf("Цена со скидкой = %s", sum);

        assertThat(Calculator.calculateDiscount(250, 1000)); // Выдаст исключение
        assertThat(Calculator.calculateDiscount(250, 15)); // Пройдет проверку
        assertThat(Calculator.calculateDiscount(250, -1)); // Выдаст исключение
        assertThat(Calculator.calculateDiscount(250, 0)); // Пройдет проверку
        assertThat(Calculator.calculateDiscount(-915, 22)); // Выдаст исключение

    }
}