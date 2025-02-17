package com.example.app;
import com.example.Circle;
import com.example.Rectangle;
import com.example.Triangle;
import com.utils.UnitСonversion;
import org.apache.maven.plugins.annotations.Mojo;

import java.util.Scanner;

@Mojo(name = "go")
public class App 
{
    public static void main( String[] args )
    {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        UnitСonversion unitСonversion = new UnitСonversion();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус круга: ");
        double radius = scanner.nextDouble();
        radius = unitСonversion.convert(radius);
        System.out.println("Площадь круга: " + circle.calculateArea(radius) + "\nПериметр  круга: " + circle.calculatePerimeter(radius));
        System.out.println("Введите стороны треугольника");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.println("Периметр  треугольника: " + triangle.calculatePerimeter(a,b,c));
        System.out.println("Введите сторону треугольника и высоту проведенную к ней");
        double side = scanner.nextDouble();
        double h = scanner.nextDouble();
        System.out.println("Площадь треугольника: " + triangle.calculateArea(side, h));
        System.out.println("Введите стороны прямоуголька: ");
        double hight = scanner.nextDouble();
        double weight = scanner.nextDouble();
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea(hight, weight) + "\nПериметр  прямоугольника: " + rectangle.calculatePerimeter(hight, weight));
    }
}
