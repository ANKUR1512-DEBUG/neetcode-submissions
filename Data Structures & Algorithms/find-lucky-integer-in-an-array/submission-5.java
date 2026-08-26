class Solution {
    public int findLucky(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        int max = -1;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == map.get(nums[j])) {
                max = Math.max(max, nums[j]);
            }
        }

        return max;
    }
}