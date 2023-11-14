package src;

import java.util.*;

public class Task_3 {
    public static void outputArrayElementsMultiplesOf_3(int[] num) {
        List<Integer> elementsMultiplesOf_3 = new ArrayList<>();
        for (int j : num) {
            if (j % 3 == 0) {
                elementsMultiplesOf_3.add(j);
            }
        }
        elementsMultiplesOf_3.sort(Comparator.naturalOrder());
        System.out.println(elementsMultiplesOf_3);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Введите числа массива:");

            int[] number = new int[5];

            for (int i = 0; i < number.length; i++) {

                number[i] = sc.nextInt();
            }

            outputArrayElementsMultiplesOf_3(number);
        }catch (InputMismatchException e) {
            System.out.println("Введен не верный тип данных");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("неправильный индекс массива строка 26");
        }
    }
}

