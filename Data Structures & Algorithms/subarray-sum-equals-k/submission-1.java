class Solution {
    public int subarraySum(int[] nums, int k) {
        int t=nums.length;
        int count=0;
        for(int i=0;i<t;i++){
            int sum=0;
            for(int j=i;j<t;j++){
                sum=sum+nums[j];
                if(sum==k){
                    count++;
                }
            }
        }return count;
    }
}