package Pol;

//Сортировка выбором

public class sortSelection {
    public static void main(String[] args) {
        int[] array = {86, 35, 65, 98, 87, 15, 78, 43, 32, 99};

        for (int i = 0; i < array.length - 1; i++){
            int min_index = i;
            for (int j = i + 1; j < array.length; j++){
                if(array[min_index] > array[j]) min_index = j;
            }
            if (min_index != i){
                int temp = array[min_index];
                array[min_index] = array[i];
                array[i] = temp;
            }
        }

        Base.printArray1(new int[][]{array});
    }
}
