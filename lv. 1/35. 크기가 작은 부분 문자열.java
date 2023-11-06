import java.util.*;
class Solution {
    public int solution(String t, String p) {
        
        int length = p.length();
        int count=0;
        Long pnum = Long.parseLong(p);
        for(int i=0; i<=(t.length()-p.length());i++){
            String tsub = t.substring(i,i+length);
            Long tnum = Long.parseLong(tsub);
            if(tnum<=pnum){
                count++;    
            }               
        }
        
        return count;             
    }
}
