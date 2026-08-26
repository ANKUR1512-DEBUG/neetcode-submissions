class Solution {
    public int[] sortArray(int[] nums) {
        int t=nums.length;
        int k=0;
        for(int i=0;i<t;i++){
            for(int j=i+1;j<t;j++){
                if(nums[i]>nums[j]){
                    k=nums[i];
                    nums[i]=nums[j];
                    nums[j]=k;
                }
            }
        }return nums;
    }
}