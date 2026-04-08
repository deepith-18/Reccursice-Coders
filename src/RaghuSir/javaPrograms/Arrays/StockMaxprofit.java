package RaghuSir.javaPrograms.Arrays;

public class StockMaxprofit {
    public static void main(String[] args) {
        int[] arr = {7,10,1,3,6,9,2};
        int ans = maxProfit(arr);
        System.out.println(ans);

    }
    static int maxProfit(int [] arr){
        int minP=arr[0];
        int buy=0,sell=0;
        int profit = 0;
        int maxProfit = 0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<minP){
                minP=arr[i];
            }else{
                profit = arr[i]-minP;
                if(profit > maxProfit){
                    maxProfit=profit;
                    buy=minP;
                    sell=arr[i];
                }
            }


        }
        System.out.println("Stock purchased at:"+buy);
        System.out.println("Stock selled at: "+sell);
        return maxProfit;
    }
}
