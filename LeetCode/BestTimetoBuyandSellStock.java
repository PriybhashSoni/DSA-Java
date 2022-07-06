class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int minp=prices[0];
        int size=prices.length;
        for(int i=0;i<size;i++)
        {
           
                minp=Math.min(minp,prices[i]);
            int profit=prices[i]-minp;
            maxp=Math.max(maxp,profit);
        
        }
        return maxp;
    }
}
