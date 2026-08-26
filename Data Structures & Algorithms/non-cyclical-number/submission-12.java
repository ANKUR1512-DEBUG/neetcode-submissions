class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        
        while(n!=1){
            n=seperate(n);
            if(set.contains(n)){
                
                return false;
            }
            set.add(n);
            
        }return true;
    }
        
        
    
    public static int seperate(int t){
       
        int num=t;
        int x=0;
        
        while(t>0){
            num=t%10;
            x=x+num*num;
            t=t/10;
        }return x;
        
    }
    
}
