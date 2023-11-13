package src;

import java.util.Scanner;

public class Task_3 {
    public static void outputArrayElementsMultiplesOf_3(int[] num) {
        for (int j : num) {
            if (j % 3 == 0) {
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите длину массива:");
        int arrayLength = sc.nextInt();

        System.out.println("Введите числа массива:");

        int[] number = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            int arrayNumbers = sc.nextInt();
            number[i] = arrayNumbers;
        }
        outputArrayElementsMultiplesOf_3(number);
    }
}

