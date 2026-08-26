class Solution {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        print(nums, new ArrayList<>(), result);

        return result;
    }

    public void print(int[] nums, List<Integer> perm,List<List<Integer>> result) {
        if (nums.length == 0) {
            result.add(new ArrayList<>(perm));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int[] newNums = new int[nums.length - 1];
            int k = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    newNums[k] = nums[j];
                    k++;
                }
            }
            perm.add(curr);
            print(newNums, perm, result);
            perm.remove(perm.size() - 1);
        }
    }
}