package Pol;

import java.util.Scanner;

//Находит минимальный элемент массива

public class MinElement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число элементов: ");
        int size = scan.nextInt();
        int[] numbers = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }

        int minIndex=0;
        int minValue = Integer.MAX_VALUE;
       
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                minIndex = i;
            }
        }
        System.out.println(minValue + " minValue");
        System.out.println(minIndex + 1 + " minIndex");

    }
}
