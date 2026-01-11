package S3_Arrays.Medium;

import java.util.Arrays;

public class P10_longestCosecutiveSequence {
    public static void main(String[] args) {
        int [] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(longestConsecutive(nums));

    }

    public static int longestConsecutive(int[] arr) {

        if (arr.length == 0) return 0;

        Arrays.sort(arr);

        int currentLength = 1;
        int maxLength = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                // skip duplicates
                continue;
            }
            else if (arr[i] == arr[i - 1] + 1) {
                currentLength++;
            }
            else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }

        return Math.max(maxLength, currentLength);
    }
}
