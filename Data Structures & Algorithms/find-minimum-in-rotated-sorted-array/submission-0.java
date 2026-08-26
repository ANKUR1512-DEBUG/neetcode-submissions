class Solution {
    public int findMin(int[] nums) {
        int min=0;
        int index=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<index){
                index=nums[i];
                
            }
        }return index;
    }
}
