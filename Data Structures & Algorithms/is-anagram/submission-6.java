class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character,Integer>set=new HashMap<>();
        HashMap<Character,Integer>sat=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(set.containsKey(s.charAt(i))){
                set.put(s.charAt(i), set.get(s.charAt(i)) + 1);
        
        }
        else{
            set.put(s.charAt(i),1);

        }

    }
    for(int i=0;i<t.length();i++){
            if(sat.containsKey(t.charAt(i))){
                sat.put(t.charAt(i), sat.get(t.charAt(i)) + 1);
        
        }
        else{
            sat.put(t.charAt(i),1);

        }
        
    } return set.equals(sat);
}
}    

