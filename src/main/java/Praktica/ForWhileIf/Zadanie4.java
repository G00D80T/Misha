package Praktica.ForWhileIf;

import java.util.Scanner;

/**
 *
 * Нужно написать код для определения времени года.
 * Реализовать ввод через консоль номера месца, по которому будет определяться название месяца и время года.
 * Определение сезона реализовать через деление на 4 и цикл if.
 * Реализовать повторнный ввод если введено неверный номер месяца.
 *
 */



public class Zadanie4 {
    public static void main(String[] args) {
        String[] monthes = {"Январь", "Февраль", "Март", "Апрель", "Мая", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        Scanner scan = new Scanner(System.in);
        int number = 0;
        boolean flag = true;
        while (flag == true) {
            System.out.println("Введите номер нужного вам месяца: ");
            number = scan.nextInt();
            if (number <1 || number > 12){
                System.out.println("Неверное введённое значение! Повторите попытку.");
                flag = true;
            }else {
                flag = false;
            }
        }
        double x = (double) number /4;
        if (x<0.7||x == 3){
            System.out.println("Вы ввели: "+number+"\nЭто "+monthes[number-1]+". Время года зима.");
        } else if (x > 0.7&&x<=1) {
            System.out.println("Вы ввели: "+number+"\nЭто "+monthes[number-1]+". Время года весна.");
        } else if (x > 1 && x <= 2) {
            System.out.println("Вы ввели: "+number+"\nЭто "+monthes[number-1]+". Время года лето.");
        } else if (x > 2 && x < 3) {
            System.out.println("Вы ввели: "+number+"\nЭто "+monthes[number-1]+". Время года осень.");
        }
    }
}
