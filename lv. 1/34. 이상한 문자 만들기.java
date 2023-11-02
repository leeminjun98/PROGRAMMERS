class Solution {//string을 쪼개서 배열로 넣은다음, 각 index별로 바꾸고, 새로운 string에 순차적으로 붙이기.
    public String solution(String s) {
        String answer="";
        int count=0;
        String[] str = s.split("");
        
        for(int i=0; i<str.length;i++){
            if(str[i].equals(" ")){
                count = 0;
            }
            else if(count%2==0){
                str[i]=str[i].toUpperCase();
                count++;
                }
            else{
                str[i]=str[i].toLowerCase();
                count++;
            }          
            
            answer+=str[i];
        }
        
        return answer;
    } 
}
