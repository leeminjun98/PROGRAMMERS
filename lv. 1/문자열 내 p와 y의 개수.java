class Solution {
    boolean solution(String s) {
        
        int pnum=0,ynum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='p' || s.charAt(i)=='P'){
                pnum++;
            }
            else if(s.charAt(i)=='y' || s.charAt(i)=='Y'){
                ynum++;
            }
            else
                continue;
        }
        if(pnum==ynum){
            return true;
        }
        else
            return false;
        
    }
}
