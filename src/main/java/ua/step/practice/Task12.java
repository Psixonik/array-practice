package ua.step.practice;

import java.lang.reflect.Array;
import java.util.Scanner;


/**
 * Программа должна выводить слово Yes для симметрич-
 * ного массива и слово No – для несимметричного. Симме-
 * тричным считается массив, в котором значения элементов с
 * конца равно значению элементов с начала. Массив заполняется
 * пользователем вручную.
 * Размер массива (количество строк и колонок) задается при
 * запуске программы.
 *
 * Примеры значений для симметричного массива:
 * <p>
 * 1, 2, 3, 2, 1
 * 2, 2, 3, 2, 2
 * 1, 3, 2, 3, 1
 * 5, 4, 3, 4, 5
 *
 *
 */

public class Task12 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размернось массива (сколько строк и колонок): ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // TODO: Пишите код здесь
        int[][] marr=new int[rows][cols];
        boolean fl=true;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                marr[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0,k=Array.getLength(marr[i])-1;j<cols/2;j++,k--)
            {
                if(marr[i][j]!=marr[i][k])
                {
                    fl=false;
                    break;
                }
            }
        }
        System.out.print((fl) ? "Yes" : "No");
    }
}
