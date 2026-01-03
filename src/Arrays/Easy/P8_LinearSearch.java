package Arrays.Easy;

public class P8_LinearSearch {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        int t=4;

        System.out.println(linearSearch(arr,t));

    }
    public static int linearSearch(int nums[], int target) {
        //Your code goes here

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }

        return -1;
    }
}
