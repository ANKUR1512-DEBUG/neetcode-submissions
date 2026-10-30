class Solution {
    public boolean makeEqual(String[] words) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < words.length; i++) {

            String s = words[i];

            for(int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        for(char ch : map.keySet()) {

            if(map.get(ch) % words.length != 0) {
                return false;
            }
        }

        return true;
    }
}