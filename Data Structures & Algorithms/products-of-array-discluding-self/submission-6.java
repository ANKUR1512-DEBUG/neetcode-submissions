class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] num=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int s=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    s=s*nums[j];
                }
            }
            num[i]=s;
            
        }return num;

    }
}  
