package Arrays.Easy;

import java.util.ArrayList;
import java.util.Collections;

public class P9_UnionOfTwoSortedArray {

    public static void main(String[] args) {
        int [] nums1 = {3, 4, 6, 7, 9, 9};
        int [] nums2 = {1, 5, 7, 8, 8};

        int [] res = unionArray(nums1,nums2);

        for(int i:res){
            System.out.print(i+" " );
        }

    }

    public static int[] unionArray(int[] nums1, int[] nums2) {

        //bruteforce
        /*
        ArrayList<Integer> li = new ArrayList<>();

        for(int i:nums1){
            if(!li.contains(i)){
                li.add(i);
            }
        }

        for(int i:nums2){
            if(!li.contains(i)){
                li.add(i);
            }
        }

        Collections.sort(li);

        int res[] = new int [li.size()];

        for(int i=0;i<li.size();i++){
            res[i]=li.get(i);
        }

        li.getLast();
        return res;
        */

        //optimal
        ArrayList<Integer> li = new ArrayList<>();

        int i = 0, j = 0;
        int n = nums1.length, m = nums2.length;

        while (i < n && j < m) {

            if (nums1[i] == nums2[j]) {
                if (li.isEmpty() || li.get(li.size() - 1) != nums1[i]) {
                    li.add(nums1[i]);
                }
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]) {
                if (li.isEmpty() || li.get(li.size() - 1) != nums1[i]) {
                    li.add(nums1[i]);
                }
                i++;
            }
            else {
                if (li.isEmpty() || li.get(li.size() - 1) != nums2[j]) {
                    li.add(nums2[j]);
                }
                j++;
            }
        }

        while (i < n) {
            if (li.isEmpty() || li.get(li.size() - 1) != nums1[i]) {
                li.add(nums1[i]);
            }
            i++;
        }

        while (j < m) {
            if (li.isEmpty() || li.get(li.size() - 1) != nums2[j]) {
                li.add(nums2[j]);
            }
            j++;
        }

        int[] res = new int[li.size()];
        for (int k = 0; k < li.size(); k++) {
            res[k] = li.get(k);
        }

        return res;

    }
}
