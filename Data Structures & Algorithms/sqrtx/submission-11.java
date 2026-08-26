class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int i=1;
        for(i=1;i<=x;i++){
            long sqr=(long)i*i;
            if(sqr>x){
                return i-1;
                

            }
        }return i-1;

    }
}