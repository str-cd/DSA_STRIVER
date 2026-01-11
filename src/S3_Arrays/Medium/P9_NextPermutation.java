package S3_Arrays.Medium;

public class P9_NextPermutation {
    public static void main(String[] args) {
        int [] nums = {1,2,3};

        nextPermutation(nums);
    }

    public static void nextPermutation(int[] arr) {
        // Your code goes here

        int index = -1;

        // 1. Find the breakpoint
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        // 2. If no breakpoint, reverse entire array
        if (index == -1) {
            reverse(arr, 0, arr.length - 1);
            return;
        }

        // 3. Find the next greater element and swap
        for (int i = arr.length - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }

        // 4. Reverse the right half
        reverse(arr, index + 1, arr.length - 1);

        for (int i:arr){
            System.out.print(i);
        }
    }

    public static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
