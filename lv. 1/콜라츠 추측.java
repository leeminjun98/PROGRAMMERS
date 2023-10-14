class Solution {
    public int solution(int num) {
        int count =0;
        long num1 = num;
        if(num1==1){
            return 0;
        }
        else{
            while(num1!=1){
                if((num1%2)==0){
                    num1/=2;
                }
                else{
                    num1 = num1*3 +1;
                }   
                count++;
                if(count>=500){
                    return -1;
                }
            }
            return count;
        }
    }
}
//계산도중에 num의 값이 int 범위를 초과할 수 있다는 생각을 나중에 했다.
