package selenium;

import java.util.Scanner;
// Задача 1

public class Lesson11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite nomer operacii: 1.Slozhenie  2.Vychitanie  3.Umnozhenie");
        int operation = in.nextInt();

        switch (operation)
        {
            case 1:
                System.out.println("Slozhenie");
                break;
            case 2:
                System.out.println("Vychitanie");
                break;
            case 3:
                System.out.println("Umnozhenie");
                break;
            default:
                System.out.println("Operaciya ne opredelena");
                break;
// Задача 2

        }
        int c = 6;

        if(c > 10){
            System.out.println("bolshe 10");
        }
        else if(c < 100){
            System.out.println("men'she 100");
        }
        else if((c / 2) > 20 ){
            System.out.println("resultat deleniya na 2 bol'she 20");
        }
        else if(c >= 5 && c <= 40 ){
            System.out.println("znachenie peremennoj mezhdu 5 i 40 vklyuchitelno");
        }
        else if(c < 5 && c > 40 ){
            System.out.println("znachenie peremennoj menshe 5 ili bolshe 40");
        }
        in.close();


    }

    }