package Arrays.Easy;



public class P14_LongestSubArrayWithGivenSum_only0andPos {

    public static void main(String[] args) {

        int [] arr ={10, 5, 2, 7, 1, 9};
        int k= 15;

        System.out.println(longestSubArray(arr,k));

    }

    public static int longestSubArray(int [] arr, int k){

        int l = 0;
        int sum = 0;
        int max = 0;

        for (int r = 0; r < arr.length; r++) {

            sum += arr[r];

            while (sum > k) {
                sum -= arr[l];
                l++;
            }

            if (sum == k) {
                max = Math.max(max, r - l + 1);
            }
        }

        return max;
    }
}
