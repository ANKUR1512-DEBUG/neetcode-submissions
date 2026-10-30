class Solution {
    public int maxScore(String s) {

        int max = 0;

        for(int i = 1; i < s.length(); i++) {

            HashMap<Character,Integer> left = new HashMap<>();
            HashMap<Character,Integer> right = new HashMap<>();

            for(int k = 0; k < i; k++) {
                char ch = s.charAt(k);

                if(left.containsKey(ch)) {
                    left.put(ch, left.get(ch) + 1);
                }
                else {
                    left.put(ch, 1);
                }
            }

            for(int k = i; k < s.length(); k++) {
                char ch = s.charAt(k);

                if(right.containsKey(ch)) {
                    right.put(ch, right.get(ch) + 1);
                }
                else {
                    right.put(ch, 1);
                }
            }

            int p = left.getOrDefault('0', 0);
int q = right.getOrDefault('1', 0);

            int sum = p + q;

            max = Math.max(sum, max);
        }

        return max;
    }
}