class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int count=0;
        for(int i=0; i<arr.length; i++){ //나누어떨어지는element개수세기
            if((arr[i]%divisor)==0){
                count++;
            }          
        }
        
        if(count==0){  //나누어떨어지는거 없을때.
            int no[]={-1};
            return no;
        }
        int index=0;
        int result[]=new int[count];
        for(int i=0; i<arr.length; i++){//나누어떨어지는 element만있는 배열만들기
            if((arr[i]%divisor)==0){
                result[index]=arr[i];
                index++;
            }          
        }
        //정렬, 이부분은 다른 풀이를보니 Arrays.sort(result);를 해주면 한줄로 해결할 수 있다.
        int temp;                                    
        for(int i=0;i<count;i++){
            for(int j=(i+1);j<count;j++){
                if(result[i]>result[j]){
                    temp = result[i];
                    result[i]=result[j];
                    result[j]=temp;
                }
            }  
        }
        return result;
        
        
    }
}
