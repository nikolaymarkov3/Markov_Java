package src;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        /*
        Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
        если нет, то вывести "Нет такого имени"
         */

        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        if (name.equals("Вячеслав")) {
            System.out.println("Привет ".concat(name));
        }else {
            System.out.println("Нет такого имени");
        }
    }
}
