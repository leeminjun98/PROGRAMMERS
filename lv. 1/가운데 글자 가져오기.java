class Solution {
    public String solution(String s) {
        
        int index = s.length()/2;
        String result;
        if(s.length()%2==0){//길이가 짝수면
            result = s.substring(index-1,index+1);
                   
        }
        else{
            result = s.substring(index,index+1);
            
            
        }
        return result;        
        
    }
}
