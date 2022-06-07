package Lesson3;

public class HomeWork3 {

    public static void main(String[] args) {
        firstHW();
        newArr();
        arr3();
        diagonal();
        printArrayInConsole(LenArray(7, 202));
    }


    //1
    public static void firstHW () {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        //           0  1  2  3  4  5  6  7  8  9
        System.out.println("index.length" + " " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr [i] + " ");
        }
        System.out.println();
    }

    //2
    public static void newArr () {
        int [] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr [i] = i;
            System.out.print(i + "; ");
        }
        System.out.println();
    }

    //3
    public static void arr3 () {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++)
            if (arr [i] < 6) {
                arr[i] *= 2;
                System.out.print(arr [i] + " ");
            } else {
                arr [i] *= 1;
                System.out.print(arr [i] + " ");
            }
        System.out.println();
    }

    //4
    public static void diagonal () {
        int[][] field = new int[5][5];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (i == j) {
                    field [i][j] = 1;
                } else {
                    field [i][j] = 0;
                }
                System.out.print(field [i][j] + " ");
            }
            System.out.println();
        }

    }

    //5

    public static int[] LenArray (int len, int initialValue){
        int [] arr = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void printArrayInConsole(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
}
