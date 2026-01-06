package S3_Arrays.Easy;

public class P11_MaxConsecutiveOnes {
    public static void main(String[] args) {
        int [] nums = {1, 1, 0, 0, 0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int max =0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            }
            if (num == 0) {
                count = 0;
            }
        }

        return max;
    }
}
