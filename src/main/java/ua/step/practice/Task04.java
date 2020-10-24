package ua.step.practice;

import java.util.Scanner;

/**
 * Задание: написать программу, которая проверяет, все ли значения
 * элементов массива различные (не повторяются). Вывести:
 * Yes – если все различные и No – если имеется хоть одно по-
 * вторение.
 * <p>
 * Размер массива задается и инициализируется в начале программы.
 */
public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        // TODO: Пишите код здесь
        int[] arr = new int[len];
        System.out.print("Введите массив через пробел: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean fl=true;
        int itemOfArr;
        int secodnItemOfArr;
        for(int i=0;i<len;i++)
        {
            itemOfArr=arr[i];
            for(int j=i+1;j<len;j++)
            {
                secodnItemOfArr=arr[j];
                if(itemOfArr==secodnItemOfArr)
                {
                    fl=false;
                    break;
                }
            }
        }
        String answer = (fl) ? "yes" : "no";
        System.out.print(answer);
    }
}
