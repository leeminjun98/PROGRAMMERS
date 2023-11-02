import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int mynum=n;
        List<Integer> list = new ArrayList<>();
        int count=0;
        while(mynum>0){
            list.add(mynum%3);
            mynum=mynum/3;    
        }
        
        for(int i=list.size()-1;i>=0;i--){
            int multi=1;
            for(int j=i;j<list.size()-1;j++){
                multi*=3;
            }
            answer+=(multi)*list.get(i);
        }
        return answer;
    }
}
