package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


/**
 * Задание: Заполнить массив размерности n случайными строчны-
 * ми (маленькими) латинскими буквами. Подсчитать, сколько раз встреча-
 * ется каждая буква. Вывести буквы, которые встречаются
 * больше 3 раз. n – задается с клавиатуры.
 * <p>
 * Пример вывода:
 * g - 4 раза
 * l - 4 раза
 * s - 5 раз
 * v - 5 раз
 * x - 5 раз
 */
public class Task08 {
    public static void Show(Map<Character, Integer> dictionary)
    {
        for(Map.Entry<Character, Integer> entry : dictionary.entrySet())
        {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if(value<4) continue;
            if(value==4)System.out.print(key+" - "+value+" раза\n");
            else System.out.print(key+" - "+value+" раз\n");
        }
    }
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest08
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
        // Использовать для генерирования элементов массива

        Random rnd = new Random(seed);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();
        char[] arr;
        // TODO: Пишите код здесь
        arr=new char[len];
        Map<Character,Integer> dictionary = new HashMap<Character,Integer>();

        int count=1;
        char itemOfArr;
        char secodnItemOfArr;
        for(int i=0;i<len;i++)
        {
            arr[i]=Character.toChars((char) rnd.nextInt(26)+97)[0];
        }
        for(int i=0;i<len;i++)
        {
            itemOfArr=arr[i];
            if(!dictionary.containsKey(itemOfArr))
            {
                count=1;
                for(int j=i+1;j<len;j++)
                {
                    secodnItemOfArr=arr[j];
                    if(itemOfArr==secodnItemOfArr)
                    {
                        count++;
                    }
                }
                dictionary.put(itemOfArr,count);
            }
        }
        Show(dictionary);
    }
}
