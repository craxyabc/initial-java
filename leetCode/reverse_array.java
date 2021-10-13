package leetCode;

import java.util.*;

public class reverse_array {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        reverse_array(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }

    private static void reverse_array(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse_array(arr, start + 1, end - 1);

    }

}
