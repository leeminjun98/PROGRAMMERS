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
//다른 사람들이 한걸 보면, n의 자릿수를 구할때 -> 자연수를 문자열로 바꾸는 string.valueOf(n)을 사용하고, 그 스트링의 길이로 자릿수를 알아낸다. 
//string s = "" +n;을 이용해서도 자릿수구할수 있다.
