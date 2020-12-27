import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {

        int ARRAY_SIZE = 8;

        initArray(ARRAY_SIZE);
        arrayAfterFour(initArray(ARRAY_SIZE));

        int[] arrayCheckOne = {1, 1, 1, 4, 4, 1, 4, 4};
        int[] arrayCheckTwo = {1, 1, 1, 1, 1, 1};
        int[] arrayCheckThree = {4, 4, 4, 4};
        int[] arrayCheckFour = {1, 4, 4, 1, 1, 4, 3};

        System.out.println(checkArrayOnOneAndFour(arrayCheckOne));

    }

    private static int[] initArray(int ARRAY_SIZE) {
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + (int) (Math.random() * 9);
            System.out.print(" " + array[i] + " ");
        }
        System.out.println();
        return array;
    }

    public static int[] arrayAfterFour(int[] arr) {

        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i] == 4) {
                return Arrays.copyOfRange(arr, i+1, arr.length);

/*
В нижеприведённой реализации происходит некорректная работа, связанная с тем, что
новый массив не всегда создаётся, если цифра "4" находится в середине или в начале первоначального массива.
*/
                //========//
//                int[] arrayWithoutFour = new int[arr.length -1 - i];
//                int k=0;
//                for (int j = i + 1; j < arr.length; j++) {
//                    arrayWithoutFour[k] = arr[j];
//                    System.out.println();
//                    System.out.println(arrayWithoutFour[k] + " ");
//                    k++;
//                }
//                return arrayWithoutFour;
                //========//
            }
        }
        System.out.println();
        throw new RuntimeException("Цифры 4 в массиве нет");
    }


    public static boolean checkArrayOnOneAndFour(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 1 && arr[i] != 4 ){
                return false;
            }
        }
        return true;
    }
}
