package Pol;

public class s1 {

//    Необходимо переместить все нули в конец массив

    public static void main(String[] args) {

        int[] array = {55, 0, 44, 43, 0, 76, 0, 1, 0, 6, 1, 3, 6};

        int index = 0;

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] != 0) {
//                array[index++] = array[i];
//            }
//        }
//            while (index < array.length){
//                array[index++] = 0;
//            }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
                index++;

            }
        }

        Base.printArray1(new int[][]{array});
//        при появлении не нулевого элемента ,будем переносить его на место указателя индекса, и увеличивать индекс на 1
    }
}