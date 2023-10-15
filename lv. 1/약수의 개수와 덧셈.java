class Solution {
    public int solution(int left, int right) {
        
        
        int result=0;
        for(int i = left;i<=right;i++){
            int count=0;
            for(int b=1;b<=i;b++){
                if(i%b==0){
                    count++;
                }
                
            }
            if(count%2==0){
                result+=i;
            }
            else{
                result-=i;
            }            
        }
        return result;        
    }
}
