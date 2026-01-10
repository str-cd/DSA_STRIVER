package S3_Arrays.Medium;

public class P5_PrintsubarrayWithMaxSum {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5, -2, 7, -4};
        int [] res = maxSubArray(arr);

        for(int i:res){
            System.out.print(i+" ");
        }
    }

    public static int [] maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum=0;

        int start =-1;
        int end = -1;

        for(int i=0;i<nums.length;i++){
            if(sum==0){
                start=i;
            }
            sum+=nums[i];

            if(sum>max){
                end=i;
                max=sum;
            }

            if(sum<0){
                sum=0;
            }
        }

        int [] res = new int [(end - start) +1];

        for(int i=0;i<res.length;i++){
            res[i]= nums[start++];
        }

        return res;

    }
}
