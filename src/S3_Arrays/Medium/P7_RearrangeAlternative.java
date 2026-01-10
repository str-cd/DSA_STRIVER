package S3_Arrays.Medium;

public class P7_RearrangeAlternative {
    public static void main(String[] args) {
        int []  nums = {2, 4, 5, -1, -3, -4};

        int [] res = rearrangeArray(nums);

        for (int i:res){
            System.out.print(i+" " );
        }
    }

    public static int[] rearrangeArray(int[] nums) {
        int [] res = new int [nums.length];

        int pos=0;
        int neg =1;

        for(int i:nums){
            if(i>0){
                res[pos]=i;
                pos=pos+2;
            }
            else{
                res[neg]=i;
                neg=neg+2;
            }
        }

        return res;
    }
}
