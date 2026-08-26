class Solution {
    public int[] sortedSquares(int[] nums) {
        
        
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            int y=x*x;
            nums[i]=y;
            

        }
        Arrays.sort(nums);
        return nums;
        
    }
}