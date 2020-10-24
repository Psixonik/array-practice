package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;

/**
 * Задание: Заполнить массив на 30 элементов случайными числами
 * от -70 до +50.
 * Найти минимальный элемент и максимальный элементы и вывести их на консоль через пробел
 */
public class Task02 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - необходимо для тестирования @see ua.step.homework.TaskTest02
        long seed =  args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        // TODO: Пишите код здесь
        int []arr=new int[30];
        int max;
        int min;
        for(int i = 0; i < 30; i++)
        {
            arr[i]=rnd.nextInt(51+70) - 70;
        }
        min=max=arr[0];
        for(int item : arr)
        {
            if(min>item)min=item;
            if(max<item)max=item;
        }
        System.out.print(min+" "+max);
    }
}
