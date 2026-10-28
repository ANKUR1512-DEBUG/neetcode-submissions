class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            int y=nums[i]+nums[i+1];
            if(y%2==0){
                return false;

            }
        }return true;
    }
}