package ua.step.practice;

import java.util.Scanner;

/**
 * Задание: Написать программу, которая проверяет, все ли значения
 * элементов массива одинаковые. Вывести: Yes – если все оди-
 * наковы и No – если имеется хоть одно различие.
 * Размер массива задается и инициализируется в начале программы.
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        // TODO: Пишите код здесь
        int[] arr = new int[len];
        boolean fl=true;
        System.out.print("Введите массив через пробел: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int itemOfArr=arr[0];
        for(int item:arr)
        {
            if(itemOfArr!=item)
            {
                fl=false;
                break;
            }
        }
        System.out.print((fl) ? "Yes" : "No");

    }
}
