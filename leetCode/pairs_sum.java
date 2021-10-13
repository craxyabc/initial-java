package leetCode;

import java.util.*;

public class pairs_sum {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int val = s.nextInt();

        pairs_sum(arr, val);

    }

    private static void pairs_sum(int[] arr, int val) {

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(val - arr[i])) {
                System.out.println(arr[i] + " " + (val - arr[i]));
            }
        }

    }

}
