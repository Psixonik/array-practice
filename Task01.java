package ua.step.practice;

/**
 * Заполнить массив на 15 элементов числами Фибоначчи.
 * Вывести на консоль только четные элементы массива.
 * <p>
 * Пример вывода:
 * 1 2 5 13 34 89 233 610
 */
public class Task01 {
    public static void main(String[] args)
    {
        // TODO: Пишите код здесь
        int []arr= new int[15];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<15;i++)
        {
            arr[i]=arr[i-2]+arr[i-1];
        }
        for (int i=0;i<15;i++)
        {
            if(i%2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}