class Solution {
    public String solution(int n) {
        
        String su = "수";
        String bak = "박";
        String result = "";
        
        for(int i=0;i<n;i++){
            if(i%2==0){
                result = result + su;
            }
            else{
                result = result + bak;
            }            
        }
        return result;  
    }
}
