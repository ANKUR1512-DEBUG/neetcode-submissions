class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length(); i++) {
            char x = chars.charAt(i);

            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }

        int y = 0;

        for (int j = 0; j < words.length; j++) {
            String h = words[j];
            HashMap<Character, Integer> temp = new HashMap<>(map);
            boolean good = true;

            for (int k = 0; k < h.length(); k++) {
                char ch = h.charAt(k);

                if (!temp.containsKey(ch) || temp.get(ch) == 0) {
                    good = false;
                    break;
                } else {
                    temp.put(ch, temp.get(ch) - 1);
                }
            }

            if (good) {
                y += h.length();
            }
        }

        return y;
    }
}
