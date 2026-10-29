class Solution {
    public boolean canConstruct(String s, String h) {
        HashMap<Character,Integer>map=new HashMap<>();
        if(h.length()<s.length()){
            return false;
        }
        for(int i=0;i<h.length();i++){
            char x=h.charAt(i);
            if(!map.containsKey(x)){
                map.put(x,1);
            }
            else{
                map.put(x,map.get(x)+1);
            }

        }
        
        for(int i=0;i<s.length();i++){
            char t=s.charAt(i);
            if(map.containsKey(t) && map.get(t) > 0){
                map.put(t,map.get(t)-1);
            }
            else{
                return false;
               
                
            }
        }return true;
        
    }
}