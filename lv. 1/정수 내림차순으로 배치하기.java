class Solution {  
    public long solution(long n) {
        
        String str = Long.toString(n);
        int arr[]=new int[str.length()];
        for(int i=0; i<str.length(); i++){
            String str1 = str.substring(i,i+1);
            arr[i] =  Integer.parseInt(str1);
        }
        int temp = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }    
        }
        //배열을 string으로 바꾸는 방법
        String result = "";
        for(int i=0; i<arr.length;i++){
            result +=arr[i];
        }
        
        return Long.parseLong(result);
        
    }
}
