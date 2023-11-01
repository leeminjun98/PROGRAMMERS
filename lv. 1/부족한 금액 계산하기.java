class Solution {
    public long solution(int price, int money, int count) {
        long totalcount=0;
        for(int i=1;i<(count+1);i++){
            totalcount+=i;
        }
        
        long totalprice = price*totalcount;
        
        if((totalprice-money)>0){
            return totalprice-money;
        }
        else 
            return 0;
        
        
        
    }
}
