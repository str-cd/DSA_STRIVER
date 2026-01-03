package Arrays.Easy;

public class P10_MissingInArray {

    public static void main(String[] args) {
        int [] nums = {0, 1, 2, 4, 5, 6};

        System.out.println(missingNumber(nums));

    }

    public static int missingNumber(int[] nums) {

        int expectedSum = ((nums.length) * (nums.length + 1)) /2 ;

        int actualSum = 0;

        for(int i:nums){
            actualSum+=i;
        }

        return expectedSum-actualSum;

    }
}
