package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.Scanner;

/**
 * Задание: Заполнить массив размерности n случайными цифрами
 * от –2 до n. Если в массиве есть хотя бы одно отрицательное
 * значение меньше -1, заменить все отрицательные значение
 * в массиве на квадрат (в степени 2) этих значений. Вывести
 * исходный и результирующий массив на консоль.
 * <p>
 * Пример вывода:
 *      Исходный массив [9, 10, -2, 4, 0, 5, 1, 8, -1, 3]
 *      Результат [9, 10, 4, 4, 0, 5, 1, 8, 1, 3]
 */
public class Task09 {
    public static void Show(int[]arr, int[]ansverArr,int len)
    {
        System.out.print("Исходный массив ["+arr[0]+", ");
        for(int i=1;i<len-1;i++)
        {
            System.out.print(arr[i]+", ");
        }
        System.out.print(arr[len-1]+"]\n");
        System.out.print("Результат ["+ansverArr[0]+", ");
        for(int i=1;i<len-1;i++)
        {
            System.out.print(ansverArr[i]+", ");
        }
        System.out.print(ansverArr[len-1]+"]\n");
    }
    public static boolean YesOrNo(int[] arr, int len)
    {
        for(int i=0;i<len;i++)
        {
            if(arr[i]<-1)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest09
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        // TODO: Пишите код здесь
        int[] arr=new int[len];
        int [] ansverArr=new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i]=rnd.nextInt(len+3)-2;
        }
        boolean fl=false;

        if(YesOrNo(arr, len))
        {
            for(int i=0;i<len;i++)
            {
                if(arr[i]<0)
                {
                    ansverArr[i]=(int)Math.pow(arr[i],2);
                }
                else
                {
                    ansverArr[i]=arr[i];
                }
            }
        }
        else
        {
            for(int i=0;i<len;i++)
            {
                ansverArr[i]=arr[i];
            }
        }
        Show(arr, ansverArr,len);
    }
}
