class Solution {
    public int coinChange(int[] coins, int amount) {

        int[] x =new int[amount+1];
        Arrays.fill(x,amount+1);
        x[0] = 0;
        for(int i=1;i<=amount;i++){
            int min =amount+1;
            for(int coin :coins){
               
                if(i-coin>=0){
                    if(min>x[i-coin]+1){
                        min = x[i-coin]+1;
                         System.out.println(min);
                        
                    }
                }
            }
            if(min<=amount){x[i]=min;}
            
           
        }
  
        return x[amount] >=amount+1 ?-1 :x[amount];
    }
}