class Solution {
    public int[] solution(int[] arr) {
        int index=0;
        int min;
        int result[]=new int[arr.length-1];
        if(arr.length==1){//배열길이 1인경우
            arr[0]=-1;
            return arr;
        }
        else{//배열길이 2이상인 경우
            min = arr[0];
            for(int i=1; i<arr.length;i++){//가장작은수가 있는 index찾기
                if(min>arr[i]){
                    min=arr[i];
                    index = i;       
                }
            }
            for(int i=0; i<(arr.length-1);i++){//가장작은수 제거한 배열 만들기
                if(i<index){
                    result[i]=arr[i];
                }
                else{
                    result[i]=arr[i+1];
                }
            }
            return result;
        }       
    }
}
