package com.homework.tasks;
/*Имеются три числа - день, месяц и год, вводимые пользователем с
консоли.
    Вывести дату следующего дня в формате &quot;День.Месяц.Год&quot;.
    Учесть переход на следующий месяц, а также следующий год.
    Форматирование строки &quot;День.Месяц.Год&quot; вынести в отдельную
функцию.*/
public class HomeWorkTask1 {
    public static void main(String[] args) {
        int value1 = 31;
        int value2 = 4;
        int value3 = 2001;
        isRightDate(value1, value2, value3);


    }
    public static void isRightDate(int day,int month,int year) {
        if (day > 0 && day <= 30 && month !=2 && month % 2 == 0) {
            System.out.println(day + "." + month + "." + year);
        } else if (day > 0 && day <= 29 && month == 2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 == 0))) {
            System.out.println(day + "." + month + "." + year);
        } else if (day > 0 && day <=28 && month == 2) {
            System.out.println(day + "." + month + "." + year);
        } else if (day > 0 && day <= 31 && month != 2 && month % 2 > 0) {
            System.out.println(day + "." + month + "." + year);

        } else {
            System.out.println("Дата не существует");
        }
    }
}
