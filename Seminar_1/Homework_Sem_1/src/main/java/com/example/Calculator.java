package com.example;

public class Calculator {
    public static double calculateDiscount(double purchaseSum, int discount) {
        if (purchaseSum < 0)
            throw new ArithmeticException("Цена не может быть меньше нуля");
        if (discount == 0)
            return purchaseSum;
        if (discount < 0 || discount > 100)
            throw new ArithmeticException("Скидка не может быть меньше 0% и больше 100%");
        return purchaseSum - purchaseSum * discount / 100;

    }
}
