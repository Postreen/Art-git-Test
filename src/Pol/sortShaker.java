package Pol;

public class sortShaker {//NEDODELAL
    public static void main(String[] args) {
        int[] array = new int[]{86, 35, 65, 98, 87, 15, 78, 43, 32, 99};

        printArray(array);
        System.out.println("\nПосле сортировки");
        printArray(array);
    }

    public static void printArray ( int[] array){
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}