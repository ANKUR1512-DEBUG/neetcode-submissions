class Solution {
    public List<String> commonChars(String[] words) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < words[0].length(); i++) {
            char x = words[0].charAt(i);

            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        for (int i = 1; i < words.length; i++) {

            HashMap<Character, Integer> temp = new HashMap<>();

            String s = words[i];

            for (int j = 0; j < s.length(); j++) {
                char x = s.charAt(j);

                if (temp.containsKey(x)) {
                    temp.put(x, temp.get(x) + 1);
                } else {
                    temp.put(x, 1);
                }
            }
            for (char x : map.keySet()) {
                if (temp.containsKey(x)) {
                    map.put(x, Math.min(map.get(x), temp.get(x)));
                } else {
                    map.put(x, 0);
                }
            }
        }
        List<String> result = new ArrayList<>();
        for (char x : map.keySet()) {
            for (int i = 0; i < map.get(x); i++) {
                result.add(String.valueOf(x));
            }
        }

        return result;
    }
}