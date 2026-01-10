package S3_Arrays.Medium;

public class P4_MaxSubarraySum {
    public static void main(String[] args) {

       int [] arr = {2, 3, 5, -2, 7, -4};

        System.out.println(maxSubArray(arr));

    }

    public static int maxSubArray(int[] nums) {
        // brute force/ better solution
        /*
        int res =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;

            for(int j=i;j<nums.length;j++){
                sum+=nums[j];

                res = Math.max(res,sum);

            }

        }
        return res;
        */

        // optimal

        int max = Integer.MIN_VALUE;
        int sum=0;

        int start =-1;
        int end = -1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>max){
                max=sum;
            }

            if(sum<0){
                sum=0;
            }
        }
        return max;

    }
}
