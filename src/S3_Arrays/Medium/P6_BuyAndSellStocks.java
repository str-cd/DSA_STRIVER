package S3_Arrays.Medium;

public class P6_BuyAndSellStocks {
    public static void main(String[] args) {
        int []  arr = {10, 7, 5, 8, 11, 9};

        System.out.println(stockBuySell(arr));
    }

    public static int stockBuySell(int[] arr) {
        // int max =0;
        // for(int i=0;i<arr.length-1;i++){

        //     for(int j=i+1;j<arr.length;j++){
        //         max = Math.max(max, arr[j]-arr[i]);
        //     }
        // }

        // return max;

        int mini = arr[0];
        int profit =0;

        for(int i=1;i<arr.length;i++){
            int cost= arr[i]-mini;
            profit= Math.max(profit,cost);
            mini = Math.min(arr[i],mini);
        }

        return profit;

}

}
