package Arrays.Easy;

import java.lang.reflect.Array;
import java.util.*;

public class P2_SecondLargestElement {
    public static void main(String[] args) {
        int [] arr = {7, 7, 2, 2, 10, 10, 10};
        System.out.println(secondLargestElement(arr));
    }
    public static int secondLargestElement(int[] nums) {

       // brute force
       /* Arrays.sort(nums);

        int largest = nums[nums.length-1];

        int secLargest=-1;

        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]!=largest) {
                secLargest = nums[i];
                break;
            }
        }

        return secLargest;
        */


        // better

        /* int largest = Integer.MIN_VALUE;

        for(int i:nums){
            if(i>largest){
                largest=i;
            }
        }

        int secLargest=Integer.MIN_VALUE;

        for(int i:nums){
            if(i>secLargest && i<largest){
                secLargest=i;
            }
        }

        return secLargest;
        */

        // optimal

        int l=nums[0];
        int secL = Integer.MIN_VALUE;

        for(int i:nums){
            if(i>l){
                secL=l;
                l=i;
            }
            else if(i<l && i>secL){
                secL=i;
            }
        }

        return secL;
    }
}
