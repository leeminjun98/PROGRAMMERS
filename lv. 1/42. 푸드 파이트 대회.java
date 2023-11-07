import java.util.*;
class Solution {
    public String solution(int[] food) {
        
        String answer="0";
        int length=0;
        for(int i=0; i<food.length; i++){
            int number=0;
            String num="";
            number = food[i]/2;//한사람당먹을 그 음식개수
            if(number>0){
                for(int j=0; j<number; j++){
                    num+= Integer.toString(i);
                }
                answer = answer.substring(0,length) + num + 0 + num + answer.substring(length+1); 
                length+=number;//한사람당 먹을개수
            }
        }
        
        return answer;
    }
}
