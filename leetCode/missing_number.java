package leetCode;

import java.util.*;

public class missing_number {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(missing_number(arr));

    }

    private static int missing_number(int[] arr) {

        int n = arr.length, sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int sum_to_be = ((n + 1) * (n + 2)) / 2;

        return sum_to_be - sum;

    }

}
