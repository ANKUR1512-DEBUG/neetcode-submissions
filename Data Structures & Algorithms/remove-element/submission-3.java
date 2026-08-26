class Solution {
    public int removeElement(int[] nums, int val) {
        int t=nums.length;
        int k=0;
        for(int i=0;i<t;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;

            }
        }return k;
    }
}