package com.example;

public class Circle {
    public double calculateArea(double radius) {
        double S = Math.PI * radius;
        return S;
    }

    public double calculatePerimeter(double radius) {
        double P = Math.PI * Math.pow(radius, 2);
        return P;
    }
}
