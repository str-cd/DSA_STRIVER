package S3_Arrays.Easy;

public class P7_MoveZeroToEnd {
    public static void main(String[] args) {
        int [] arr = {0, 1, 4, 0, 5, 2};

        moveZeroes(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
    public static void moveZeroes(int[] nums) {

        //brute force
        /*int [] temp = new int[nums.length];

        int ind=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                temp[ind++]=nums[i];
            }
        }

        for(int i=0;i<temp.length;i++){
            nums[i]=temp[i];
        }
        */

        //
        int ind=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ind=i;
                break;
            }
        }

        if(ind==nums.length-1){
            return ;
        }
        int l=ind;
        int r=l+1;
        while(r<nums.length){
            if(nums[r]!=0){
                nums[l]=nums[r];
                nums[r]=0;
                l++;
                r++;
            }
            else{
                r++;
            }
        }
    }
}
