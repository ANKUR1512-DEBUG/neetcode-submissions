class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else{
            map.put(a,1);
            }
        }
        int x=0;
        int z = Integer.MAX_VALUE;
        ArrayList<Character> keys = new ArrayList<>(map.keySet());
        
        for(int i=0;i<keys.size();i++){
            int y=map.get(keys.get(i));
            if(y%2!=0){
                x=Math.max(x,y);
            }
            else{
                z=Math.min(z,y);

            }
        }
        return x - z;
    }
}