class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxFreq = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            // Increase frequency of c
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

            // Find highest frequency
            maxFreq = Math.max(maxFreq, map.get(c));

            // Shrink window if invalid
            while ((right - left + 1) - maxFreq > k) {

                char x = s.charAt(left);

                map.put(x, map.get(x) - 1);

                left++;
            }

            // Find largest valid window
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
