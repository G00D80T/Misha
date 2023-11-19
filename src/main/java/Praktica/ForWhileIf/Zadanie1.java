package Praktica.ForWhileIf;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie1 {
    /**
     * Мы попали в подземелье. У нас нет карты,
     * но есть код (массив) в котором зашифрованы номера дверей ведущих к выходу.
     * Реализуйте код при помощи цикла for и ветвления if, который проведёт вас до выхода. Ввод кода производится через консоль.
     * В комнатах неуказаных в коде расположить ловушки (в консоль выводится сообщения, например: "вы попали в капкан..."),
     * после чего предлагается перезапуск прохождения.
     * Реализовать наполнение массива "кода" через for и заполнить рандомными целыми числами(Random.nextInt),
     * выбор комнать реализовать через консоль.
     * Рестарт предлагать в случае провала или прохождения всего подземелья..
     **/
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int counter = 0;
        boolean restart = true;
        while (restart == true) {
            System.out.println("Введите желаемое число этажей: ");
            int countRooms = s.nextInt();
            Integer[] rooms = new Integer[countRooms];
            for (int i = 0; i < countRooms; i++) {
                rooms[i] = r.nextInt(10) + 1;
            }
            System.out.println("Секретный код: " + Arrays.toString(rooms));
            for (int j = 0; j < rooms.length; j++) {
                System.out.println("Перед вами 10 дверей. Выберите номер двери в которую хотите войти: ");
                int num = s.nextInt();
                boolean proverka = true;
                if (num == rooms[j]) {
                    System.out.println("Вы выбрали верную комнату!");
                    counter++;
                } else {
                    System.out.println("Вы угодили в ловушку...");
                    break;
                }
            }
            if (counter == rooms.length) {
                System.out.println("Вы прошли подземелье! Поздравляем!");
                restart = false;
            } else {
                boolean f = true;
                while (f) {
                    System.out.println("Желаете попробовать ещё раз?\n 1 - Да. \n 2 - Нет.");
                    int choice = s.nextInt();
                    if (choice == 1) {
                        f = false;
                    } else if (choice == 2) {
                        System.out.println("GAME OVER");
                        f = false;
                        restart = false;
                    } else {
                        System.out.println("Неправильная команда. Повторите попытку.");
                    }
                }
            }
        }
    }
}

