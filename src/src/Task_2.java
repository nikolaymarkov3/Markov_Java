package src;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        if (name.equals("Вячеслав")) {
            System.out.println("Привет ".concat(name));
        }else {
            System.out.println("Нет такого имени");
        }
    }
}
