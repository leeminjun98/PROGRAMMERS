class Solution {
    public String solution(String phone_number) {
        
        int length = phone_number.length();
        length = length-4;
        String str = phone_number.substring(length);
        String star="";
        for(int i=0; i<length;i++){
            star= star +"*";
        }
        return (star+str);
        
        
    }
}
