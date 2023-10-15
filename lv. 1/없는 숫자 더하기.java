import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        
        int result =0;
        Arrays.sort(numbers);
        for(int i=0; i<10;i++){
            for(int j=0; j<numbers.length; j++){
                if(i==numbers[j]){
                     result+=i;
                 }
            }
        }        
        return (45-result);        
    }
}
