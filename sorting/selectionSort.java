import java.util.Scanner;

/**
 * selectionSort
 */
public class selectionSort {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.print("Enter Array Elements : ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        selectionSort(arr);

        for (int ar : arr) {
            System.out.print(ar + " ");
        }

    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        return arr;

    }

}