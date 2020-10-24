package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.Scanner;
import java.lang.reflect.Array;

/**
 * Задание: Есть массив размером n элементов и заполненный
 * случайными числами в диапазоне от 0 до 100.
 * Необходимо разделить этот массив на массивы меньшего
 * размера в каждом из которых будет находиться не менее m элементов из
 * большого массива.
 * Значения n и m вводятся с клавиатуры пользователем.
 * Вывести на экран исходный массив и разделенный массив.
 *
 * Пример вывода:
 *
 * Исходный массив [35, 80, 39, 79, 63, 32, 89, 22, 29, 29]
 * Результат
 * [35, 80, 39]
 * [79, 63, 32]
 * [89, 22, 29]
 * [29]
 */
public class Task11 {
    public static void Show(int[]arr, int[][]ansverArr, int n, int rows)
    {
        System.out.print("Исходный массив ["+arr[0]+", ");
        for(int i=1;i<n-1;i++)
        {
            System.out.print(arr[i]+", ");
        }
        System.out.print(arr[n-1]+"]\n");
        System.out.println("Результат");
        for(int i=0;i<rows;i++)
        {
            if(Array.getLength(ansverArr[i])!=1 )
            {
                System.out.print("[");
                System.out.print(ansverArr[i][0]);
                for (int j = 1, k = 1; j < Array.getLength(ansverArr[i])-1; j++, k++)
                {
                    System.out.print(", "+(ansverArr[i][j]));
                }
                System.out.println(", "+ansverArr[i][Array.getLength(ansverArr[i])-1] + "]");
            }
            else if(Array.getLength(ansverArr[i])==1)
            {
                System.out.println("["+ansverArr[i][0]+"]");
            }
        }
    }
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest09
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массивов через пробел: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();


        // TODO: Пишите код здесь
        int[] arr=new int [n];
        int ansverArr[][];
        for(int i=0;i<n;i++)
        {
            arr[i]=rnd.nextInt(101);
        }
        int rows;
        if(n%m!=0)
        {
            rows=n/m+1;
            ansverArr=new int[rows][];
            for(int i=0;i<rows-1;i++)
            {
                ansverArr[i]= new int[m];
            }
            ansverArr[rows-1]= new int[n-m*(rows-1)];
        }
        else
        {
            rows=n/m;
            ansverArr=new int[rows][m];
        }

        for(int i=0,j=0,k=0;i<n;i++,k++)
        {
            ansverArr[j][k]=arr[i];
            if((i+1)%m==0)
            {
                j++;
                k=-1;
            }
        }
        Show(arr,ansverArr,n,rows);
    }
}
