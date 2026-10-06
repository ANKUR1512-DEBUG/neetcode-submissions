class Solution {
    public String kthDistinct(String[] arr, int k) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

            if (map.get(s) == 1) {
                k--;

                if (k == 0) {
                    return s;
                }
            }
        }

        return "";
    }
}