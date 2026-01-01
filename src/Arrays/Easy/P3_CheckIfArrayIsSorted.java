package Arrays.Easy;


public class P3_CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int [] arr = {1, 2, 10, 3, 4, 10, 10, 10};

        System.out.println(isSorted(arr));
    }

    private static boolean isSorted(int[] arr) {

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }

        return true;
    }
}
