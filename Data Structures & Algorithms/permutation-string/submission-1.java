class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] a = new int[26];
        int[] b = new int[26];

        // Count s1
        for (int i = 0; i < s1.length(); i++) {
            a[s1.charAt(i) - 'a']++;
        }

        // First window
        for (int i = 0; i < s1.length(); i++) {
            b[s2.charAt(i) - 'a']++;
        }

        // Check first window
        boolean same = true;

        for (int j = 0; j < 26; j++) {
            if (a[j] != b[j]) {
                same = false;
                break;
            }
        }

        if (same) {
            return true;
        }

        // Sliding window
        for (int i = s1.length(); i < s2.length(); i++) {

            // Add new character
            b[s2.charAt(i) - 'a']++;

            // Remove old character
            b[s2.charAt(i - s1.length()) - 'a']--;

            // Compare
            same = true;

            for (int j = 0; j < 26; j++) {
                if (a[j] != b[j]) {
                    same = false;
                    break;
                }
            }

            if (same) {
                return true;
            }
        }

        return false;
    }
}
