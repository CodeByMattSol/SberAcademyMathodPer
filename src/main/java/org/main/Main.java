package org.main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину стороны квадрата: ");
        int side = scanner.nextInt();
        System.out.println("Введите длину прямоугольника: ");
        int length = scanner.nextInt();
        System.out.println("Введите ширину прямоугольника: ");
        int width = scanner.nextInt();

        int squareArea = rectArea(side);
        int rectangleArea = rectArea(length, width);

        System.out.println("Площадь квадрата: " + squareArea);
        System.out.println("Площадь прямоугольника: " + rectangleArea);
    }

    public static int rectArea(int side) {
        return side * side;
    }

    public static int rectArea(int length, int width) {
        return length * width;
    }
}