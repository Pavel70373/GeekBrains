
import java.util.Arrays;

public class HomeWork_3 {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));


        int[] myArray = new int[100];
        for (int i = 0;i < myArray.length;i++){
            myArray[i] = i + 1;
        }
        System.out.println();
        System.out.println(Arrays.toString(myArray));


        int[] array1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println();
        System.out.println(Arrays.toString(array1));
        for (int i = 0;i < array1.length;i++){
            if (array1[i] < 6){
                array1[i] = array1[i] * 2;
            }

        }
        System.out.println(Arrays.toString(array1));


        int[][] arrayTwo = new int[4][4];
        System.out.println();
        for (int i = 0; i < arrayTwo.length;i++){
            for (int j = 0;j < arrayTwo.length;j++) {
              //  System.out.print(arrayTwo[i][j]);
               // System.out.println(Arrays.toString(arrayTwo[i]));
                if (arrayTwo[i] == arrayTwo[j]) {
                    arrayTwo[i][j] = 1;
                }else {
                    arrayTwo[i][j] = 0;
                }
                    System.out.print(arrayTwo[i][j] + " ");
            }
            System.out.println();
        }

        array4(6,21);
        arrMinAndMax();

    }

    public static void array4(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0;i < arr.length;i++){
            arr[i] = initialValue;
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

    public static void arrMinAndMax(){
        int[] myArray4 = {25,4,2,4,5,0,16};
        int xMax;
        xMax = myArray4[0];
        int xMin;
        xMin = myArray4[0];
        for (int i = 1;i < myArray4.length;i++){
            if (myArray4[i] > xMax) {
                xMax = myArray4[i];
            }
            if (myArray4[i] < xMin) {
                xMin = myArray4[i];
            }
        }

        System.out.println();
        System.out.println("Минимальный элемент массива равен: " + xMin);
        System.out.println("Максимальный элемент массива равен: " + xMax);
    }

}

