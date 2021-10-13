import java.util.Scanner;

/**
 * insertionSorting
 */
public class insertionSorting {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.print("Enter elements of array : ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        insertionsort(arr);

        for (int ar : arr) {
            System.out.print(ar + " ");
        }

    }

    public static int[] insertionsort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = val;
        }

        return arr;

    }

}