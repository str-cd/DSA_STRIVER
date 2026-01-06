package S3_Arrays.Easy;

public class P12_Single_Number1 {
    public static void main(String[] args) {

        int [] arr = {1, 2, 2, 4, 3, 1, 4};

        System.out.println(singleNumber(arr));

    }

    public static int singleNumber(int[] nums) {
        //your code goes her

        int xor = 0;

        for(int i:nums){
            xor=xor^i;
        }

        return xor;

    }
}
