class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        HashSet<Character> set = new HashSet<>();

        for(int k = 0; k < allowed.length(); k++) {
            char a = allowed.charAt(k);
            set.add(a);
        }

        for(int i = 0; i < words.length; i++) {
            String s = words[i];
            boolean valid = true;

            for(int j = 0; j < s.length(); j++) {
                char x = s.charAt(j);

                if(!set.contains(x)) {
                    valid = false;
                    break;
                }
            }

            if(valid) {
                count++;
            }
        }

        return count;
    }
}