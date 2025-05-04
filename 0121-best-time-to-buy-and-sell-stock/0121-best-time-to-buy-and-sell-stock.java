class Solution {
    public int maxProfit(int[] prices) {
        int minPay=0;
        int maxProfit = 0;
        int i=0;
        int j=1;
        while(j<prices.length){
            if(prices[j] > prices[i]) {
                maxProfit = Integer.max(prices[j] - prices[i], maxProfit);
                j++;
            }
            //<=
            else {
                i = j;
                j = i + 1;
            }
        }

        return maxProfit;
    }
}