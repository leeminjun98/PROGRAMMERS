class Solution {
    public int[] solution(long n) {
        
        int count=0;
        long num = n;
        while(n>0){
            n = n/10;
            count++;
        }
        int[] result = new int[count];
        for(int i=0;i<count;i++){
            result[i]=(int)(num%10);
            num/=10; 
        }
        return result;
    }
}
