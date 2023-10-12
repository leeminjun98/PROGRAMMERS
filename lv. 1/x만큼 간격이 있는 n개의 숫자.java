class Solution {
    public long[] solution(int x, int n) {
        
        long result[]=new long[n];
        long add = x;   //x가 나중에는 커져서 int type을 벗어날 수 있는거 주의!!
        for(int i=0;i<n;i++){
            result[i]=(i+1)*add;
            }
        
        return result;
    }
}


