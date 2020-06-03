package april2020;

/**
 * give max profit from a given list
 * 7,1,5,3,6,4 => 5
 */
public class BuyAndSellStock1_5 {
    public static void main(String[] sjdakds){
        //int prices[] = {7,1,5,3,6,4};
        int prices[] = {1,2};
        System.out.println(maxProfitBigOofN(prices));

    }

    public static int maxProfit(int[] prices) {
        int maxProfitVal = 0;
        int profitVal = 0;
        for(int i=0; i<prices.length - 1; i++){
            for(int j=i+1;j<prices.length-1;j++){
                profitVal = prices[j] - prices[i];
                maxProfitVal = Math.max(profitVal, maxProfitVal);

            }
        }
        return maxProfitVal;
    }

    public static int maxProfitBigOofN(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }
        int maxProfit = 0, minVal = prices[0];
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minVal);
            minVal = Math.min(prices[i], minVal);
        }
        return maxProfit;
    }

}
