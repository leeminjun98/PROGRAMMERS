class Solution {
    public int solution(int[] nums) {
        
        //Arrays.sort(nums); 이거 쓰면 안되냐??
        //정렬
        int temp=0;
        int num=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        //종류세기
        int count = 1;
        int n = nums[0];
        for(int i=1;i<nums.length;i++){
            if(n!=nums[i]){
                n=nums[i];
                count++;
            }            
        }
        
        if(count>=(nums.length/2)){
            return (nums.length/2);
        }
        
        return count;
            
    }
}
