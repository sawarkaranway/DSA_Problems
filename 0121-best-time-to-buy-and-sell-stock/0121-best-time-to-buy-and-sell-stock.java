class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int minEle= Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minEle){
                minEle=prices[i];

            }
            else{
                max = Math.max(max,prices[i]-minEle);
            }
        }
        return max;
        
    }
}