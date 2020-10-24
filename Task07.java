package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 * Задание: Заполнить массив размерности n случайными цифрами
 * от 3 до 13. Подсчитать, сколько раз встречается каждая циф-
 * ра. Вывести результат на экран. n – задается с клавиатуры
 *
 * Пример вывода:
 *      3 - 2 раза
 *      5 - 3 раза
 *      8 - 1 раза
 *      9 - 3 раза
 *      11 - 1 раза
 */
public class Task07 {
    public static void Show(Map<Integer, Integer> dictionary)
    {
        for(Map.Entry<Integer, Integer> entry : dictionary.entrySet())
        {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.print(key+" - "+value+" раза\n");
        }
    }
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest07
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        //Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        int[] arr;
        // TODO: Пишите код здесь
        arr=new int[len];
        Map<Integer,Integer> dictionary = new HashMap<Integer,Integer>();
        int count=1;
        boolean fl=true;
        int itemOfArr;
        int secodnItemOfArr;
        for(int i=0;i<len;i++)
        {
            arr[i]=rnd.nextInt(11)+3;
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
