

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: count frequency
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Step 2: create list from keys
        List<Integer> list = new ArrayList<>(map.keySet());

        // Step 3: sort based on frequency
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        // Step 4: take top k
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
