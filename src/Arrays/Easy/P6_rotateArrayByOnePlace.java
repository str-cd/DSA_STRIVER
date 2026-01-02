package Arrays.Easy;

public class P6_rotateArrayByOnePlace {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        rotateArrayByOne(arr);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void rotateArrayByOne(int[] nums) {
        if(nums.length==1){
            return ;
        }
        int temp = nums[0];

        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                nums[i]=temp;
            }
            else{
                nums[i]=nums[i+1];
            }
        }
    }
}
