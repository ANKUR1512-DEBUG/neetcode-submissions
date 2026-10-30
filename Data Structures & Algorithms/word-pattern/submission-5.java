class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] arr = s.split(" ");

        if(pattern.length() != arr.length) {
            return false;
        }

        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++) {

            char x = pattern.charAt(i);
            String h = arr[i];

            if(map1.containsKey(x)) {
                if(!map1.get(x).equals(h)) {
                    return false;
                }
            }

            if(map2.containsKey(h)) {
                if(map2.get(h) != x) {
                    return false;
                }
            }

            map1.put(x,h);
            map2.put(h,x);
        }

        return true;
    }
}