package Praktica.ForWhileIf;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 *Написать код который будет переворачивать заданое слово, и выводить отдельно глассные и согласные буквы.
 *
 **/



public class Zadanie3 {
    public static void main(String[] args) {
        String word = "Хацкер";
        Pattern p = Pattern.compile("[ЁУЕЫАОЭЯИЮёуеыаоэяию]");
        Matcher m;
        char[] mas = word.toCharArray();
        for (int i = mas.length-1; i > -1; i--){
            System.out.println(mas[i]);
        }
    }
}
