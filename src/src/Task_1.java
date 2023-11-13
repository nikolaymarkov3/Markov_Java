package src;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        /*
        Составить алгоритм: если введенное число больше 7, то вывести “Привет”
         */
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        }
    }
}
