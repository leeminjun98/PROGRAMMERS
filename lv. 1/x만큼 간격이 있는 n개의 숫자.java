class Solution {
    public long[] solution(int x, int n) {
        
        long result[]=new long[n];
        long add = x;
        for(int i=0;i<n;i++){
            result[i]=(i+1)*add;
            }
        
        return result;
        
        
    }
}
