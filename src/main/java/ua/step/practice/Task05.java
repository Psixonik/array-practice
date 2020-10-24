package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;

/**
 * Задание: Заполнить массив на 10 элементов случайными числами
 * от -5 до +5. Посчитать количество повторяющихся значений.
 * Вывести на консоль только повторяющиеся элементы (больше одного повторения)
 * и количество повторений.
 * <p>
 * Пример:
 * 0 – 5 раз
 * 2 – 3 раза
 * 7 – 2 раза
 */
public class Task05 {
    public static void Show(Map<Integer, Integer> dictionary)
    {
        for(Map.Entry<Integer, Integer> entry : dictionary.entrySet())
        {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(value==2|| value==3 || value==4)System.out.print(key+" - "+value+" раза\n");
            else System.out.print(key+" - "+value+" раз\n");
        }
    }
    public static void main(String[] args)
    {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest05
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        // TODO: Пишите код здесь
        int len=10;
        int count=0;
        boolean fl=false;
        int itemOfArr;
        int secodnItemOfArr;

        int []arr=new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i]=rnd.nextInt(6+5) - 5;
        }
        Map<Integer,Integer> dictionary = new HashMap<Integer,Integer>();
        for(int i=0;i<len;i++)
        {
            itemOfArr=arr[i];
            if (!dictionary.containsKey(itemOfArr))
            {
                count=1;
                for(int j=0;j<len;j++)
                {
                    if(i==j) continue;
                    secodnItemOfArr=arr[j];
                    if(itemOfArr==secodnItemOfArr)
                    {
                        count++;
                        fl=true;
                    }
                }
                if(fl&&count>=2)
                {
                    dictionary.put(itemOfArr,count);
                }
            }
        }
        Show(dictionary);
    }
}
