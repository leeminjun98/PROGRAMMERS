class Solution {
    public int solution(String s) {
        
        int result=0;
        if(s.contains("-")){
            result = Integer.parseInt(s.substring(1));
            result = 0 - result;
        }
        else if(s.contains("+")){
            result = Integer.parseInt(s.substring(1));
        }
        else{
            result = Integer.parseInt(s);
        }
        return result;
        
    }
}
