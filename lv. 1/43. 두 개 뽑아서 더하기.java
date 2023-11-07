import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                sum = numbers[i]+numbers[j];
                if(list.contains(sum)==false){
                    list.add(sum);
                }
                
            }
            
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size();i++){
            answer[i]=list.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
        
    }
}
