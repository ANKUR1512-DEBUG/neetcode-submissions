class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int s = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                s = s + nums[i];
            }
            else {
                s = nums[i];
            }

            max = Math.max(max, s);
        }

        return max;
    }
}