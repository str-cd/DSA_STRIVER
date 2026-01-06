package S3_Arrays.Easy;

public class P5_rotateArrayByKPlace {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int k=3;
        rotateArray(arr,k);

        for(int i:arr){
            System.out.print(i+" ");
        }

    }

    public static void rotateArray(int[] nums, int k) {
        k=k%nums.length;
        rev(nums , 0 , k-1 );
        rev(nums , k , nums.length-1 );
        rev (nums , 0 , nums.length-1);
    }

    public static void rev(int [] arr , int l , int r){

        while(l<=r){
            int temp= arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}
