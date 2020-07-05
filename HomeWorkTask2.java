package com.homework.tasks;
/*Написать программу, вычисляющую корни квадратного уравнения
вида ax ² + bx + c = 0, где a, b и c - вводимые пользователем из консоли
данные.
    Учитывать только реальные корни (в случае отрицательного
дискриминанта выводить сообщение пользователю).
    При решении создать и использовать следующие вынесенные
функции:
    - функция isPositive, определяющая, является ли число
положительным
    - функция isZero, определяющая, является ли число нулём
    - функция discriminant, вычисляющая дискриминант*/
public class HomeWorkTask2 {
    public static void main(String[] args) {
        double D;
        double a = 10;
        double b = 2;
        double c = 20;

//        double x1 = (-b - Math.sqrt(D)) / (2 * a);
//        double x2 = (-b + Math.sqrt(D)) / (2 * a);

    }
    public static void isDiscriminant(double D1,double a1,double b1,double c1) {
        D1 = b1 * b1 - 4 * a1 * c1;
        if (D1 < 0) {
            System.out.println("Дискриминант отрицательный");

        }
    }
}
