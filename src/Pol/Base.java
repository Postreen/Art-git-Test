package Pol;

public class Base {
    public static void main(String[] args) {

//        Создание двумерного массива и его вывод

        int[][] array = {
                {1, 3, 6, 8, 9},
                {15, 23, 65, 76, 87},
                {98, 106, 111, 123, 142},
                {176, 189, 199, 200, 201},
                {206, 267, 289, 299, 300}
        };
        printArray1(array);

    }
    public static void printArray1(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


}
