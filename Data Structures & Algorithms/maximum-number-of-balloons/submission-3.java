class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        String s = "balloon";

        for (int i = 0; i < text.length(); i++) {
            char x = text.charAt(i);

            if (!map.containsKey(x)) {
                map.put(x, 1);
            } else {
                map.put(x, map.get(x) + 1);
            }
        }

        int z = Integer.MAX_VALUE;
        ArrayList<Character> keys = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            keys.add(s.charAt(i));
        }

        for (int i = 0; i < keys.size(); i++) {
            char ch = keys.get(i);
            int y = map.getOrDefault(ch, 0);

            if (ch == 'l' || ch == 'o') {
                y = y / 2;
            }

            z = Math.min(z, y);
        }

        return z;
    }
}
