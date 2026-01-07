package S3_Arrays.Medium;

import java.lang.reflect.Array;
import java.util.Arrays;

public class P2_Sort0_1_2 {
    public static void main(String[] args) {

        int [] nums = {1, 0, 2, 1, 0};

        sortZeroOneTwo(nums);

        for(int i:nums){
            System.out.print(i+ " ");
        }

    }

    public static void sortZeroOneTwo(int[] arr) {
        // brute force
         //Arrays.sort(arr);

        // better
        /*
        int zero = 0;
        int one = 0;
        int two= 0;

        for(int i:arr){
            if(i==0){
                zero++;
            }
            else if(i==1){
                one++;
            }
            else{
                two++;
            }
        }


        int ind=0;

        while(zero>0){
            arr[ind++]=0;
            zero--;
        }

        while(one>0){
            arr[ind++]=1;
            one--;
        }

        while(two>0){
            arr[ind++]=2;
            two--;
        }

         */

        //optimal

        int low =0;
        int mid =0;
        int high = arr.length-1;

        while(mid<=high){

            if(arr[mid]== 0){
                int temp = arr[low];
                arr[low]= arr[mid];
                arr[mid]= temp;
                low++;
                mid++;
            }

            else if(arr[mid] ==1){
                mid++;
            }

            else{
                int temp = arr[mid];
                arr[mid]= arr[high];
                arr[high] = temp;
                high--;
            }


        }
    }
}
