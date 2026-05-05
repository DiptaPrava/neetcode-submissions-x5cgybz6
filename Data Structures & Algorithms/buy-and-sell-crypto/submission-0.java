class Solution {
    public int maxProfit(int[] prices) {
       ArrayList<Integer> list = new ArrayList<>(); 
       int res = 0;
        for(int i =0;i<prices.length-1; i++){
            for(int j = i+1; j<prices.length; j++){
                int profit = prices[j] - prices[i];
                res = Math.max(res,profit);
            }

        }
        return res;
    }
}
