class Solution {
    public int solution(int[][] sizes) {
        int garomax=0;
        int seromax=0;
        
        for(int i=0; i<sizes.length;i++){
            if(sizes[i][0]<sizes[i][1]){
                int temp;
                temp = sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=temp;
            }
            if(sizes[i][0]>garomax){
                garomax=sizes[i][0];
            }
            if(sizes[i][1]>seromax){
                seromax=sizes[i][1];
            }
            
            
        }
        
        return garomax*seromax;     
    }
}
