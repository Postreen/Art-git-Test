package Pol;

//Сортировка вставками

public class sortInsertion {

    public static void main(String[] args) {
        int[] array = {86, 35, 65, 98, 87, 15, 78, 43, 32, 99};

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j;
            for (j = i - 1; j >= 0 && temp < array[j]; j--)
            array[j+1] = array[j];
            array[j+1] = temp;
        }
        Base.printArray1(new int[][]{array});
    }
}
