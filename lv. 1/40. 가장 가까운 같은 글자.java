class Solution {
    public int[] solution(String s) {
        
        int[] result = new int[s.length()];
        result[0]=-1;       
        for(int i=1; i<s.length();i++){
            char ch=s.charAt(i);
            for(int j=i-1; j>=0;j--){
                if(ch==s.charAt(j)){
                    result[i]=i-j;
                    break;
                }
                else{
                    result[i]=-1;
                }
            }
            
        }
        
        return result;
        
    }
}
