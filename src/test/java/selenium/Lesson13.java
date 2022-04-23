package selenium;

import java.util.Scanner;

public class Lesson13 {
    public static void main(String[] args) {

        //Задача 3 (комментарий преподавателя)
        for (int i = 40; i <= 60; i = i + 4)
            System.out.println(i);

        //Задача 2  (комментарий преподавателя)
        for (int i = 5; i < 10000; i = i * 5)
            System.out.println(i);


//Задача 1

        int i;
        for (i = 0; i < 16; i++) {
            System.out.println(i);
        }

//Задача 2

        int number = 5;// Возводимое в степень число
        int result = number;// Результат возведения в степень
        int power = 1;// Начальный показатель степени
        do {
            System.out.println(number + " v stepeni " + power + " = " + result);
            power++;
            result = result * number;
        } while (result < 10000); // условие выхода из цикла


//Задача 3

        int b;
        for (b = 40; b <= 60; b++)

            if (b % 4 == 0) {

                System.out.println(b);
            }
    }
}





