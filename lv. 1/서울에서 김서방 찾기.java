class Solution {
    public String solution(String[] seoul) {
        String str = "김서방은 x에 있다";
        
        for(int i=0; i<seoul.length; i++){
            
            if(seoul[i].equals("Kim")){
                str = str.substring(0,5) + i + str.substring(6);
            }
        }
        return str;
    }
}
