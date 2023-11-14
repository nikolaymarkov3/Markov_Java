package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            double number = sc.nextDouble();

            if (number > 7) {
                System.out.println("Привет");
            }
        }catch (InputMismatchException e){
            System.out.println("Введен не верный тип данных");
        }

    }
}
