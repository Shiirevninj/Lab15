package com.nar.lab15;

public class Division {
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Тоог 0-д хуваах боломжгүй");
        }
        return a / b;
    }
}
