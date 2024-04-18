package Pol;

public class sortBubble {

    public static void main(String[] args) {
        int[] array = new int[]{66, 33, 65, 98, 87, 15, 78, 43, 32, 99};


        boolean isSorted = false;
        while (!isSorted) { //пока массив не отсортирован
            isSorted = true; //считаем, что массив отсортирован
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false; //если эта часть кода выполнилась, считаем, что массив не отсортирован
                }
            }
        }
        Base.printArray1(new int[][]{array});


    }
}