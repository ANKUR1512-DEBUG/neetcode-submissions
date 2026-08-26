class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums, new ArrayList<>(), result);

        return result;
    }

    public void backtrack(int[] nums, List<Integer> perm,
                           List<List<Integer>> result) {

        if (nums.length == 0) {
            result.add(new ArrayList<>(perm));
            return;
        }

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            int x = nums[i];

            if (set.contains(x)) {
                continue;
            }
            set.add(x);
            int[] newNums = new int[nums.length - 1];
            int k = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    newNums[k] = nums[j];
                    k++;
                }
            }
            perm.add(x);
            backtrack(newNums, perm, result);
            perm.remove(perm.size() - 1);
        }
    }
}