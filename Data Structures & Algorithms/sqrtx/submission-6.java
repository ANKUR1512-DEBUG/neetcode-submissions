class Solution {
    public int mySqrt(int x) {
        int left=1;
        int right=x;
        int ans=0;
        if(x==0){ //base case
            return 0;
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            long sqr=(long)mid*mid;
            if(x==sqr){
                return mid;
            }
            else if(x>sqr){
                ans=mid;
                left=mid+1;

            }
            else{
                right=mid-1;
            }
        }return ans;

    }
}