class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] x = new int[amount+1];
       
        Arrays.fill(x,amount+1);
        x[0]=0; 
        for(int coin :coins){
            for(int i=coin;i<=amount;i++){
                x[i]=Math.min(x[i],x[i-coin]+1);


            }
        }
        return x[amount]<amount+1 ? x[amount] : -1; 
    }
}