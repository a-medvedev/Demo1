package org.kriyak.test;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String args[]) {

        Random rand = new Random();
        int num = rand.nextInt(99)+1; //Загадываемое число в диапазоне от 1..100
        int tries = 8, choice; //tries - кол-во попыток,  choice - ввод пользователя
        System.out.println("Компьютер загадал число!");
        while (tries != 0){
            System.out.print("Введите чмсло: ");
            String strNum = new Scanner(System.in).next();
            try {
                choice = Integer.parseInt(strNum);
            }
            catch (NumberFormatException e) { //если пользователь ввёл не число
               System.out.println("Некорректный ввод. Попробуйте снова.");
               continue;
            }


            if(choice == num){
                System.out.println("Вы угадали!");
                break;
            } else {
                if (choice < num){
                    System.out.println("Загаданное число больше.");
                }else{
                    System.out.println("Загаданное число меньше.");
                }
            }
            tries--;
            System.out.println("Попыток осталось: " + tries);
            if (tries == 0){
                System.out.println("Вы проиграли. Загаданнное число: " + num);
            }
        }


    }
}
