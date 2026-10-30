class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }
            else {
                map.put(ch, 1);
            }
        }

        int count = 0;
        boolean odd = false;

        for(char ch : map.keySet()) {

            int freq = map.get(ch);

            if(freq % 2 == 0) {
                count += freq;
            }
            else {
                count += freq - 1;
                odd = true;
            }
        }

        if(odd) {
            count++;
        }

        return count;
    }
}