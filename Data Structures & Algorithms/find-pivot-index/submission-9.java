class Solution {
    public int pivotIndex(int[] nums) {
        int p=0;
        int sum1=0;
        int sum2=0;
        int r=nums.length;
        
        for(p=0;p<nums.length;p++){
            
            sum2=sum(p+1,r,nums);
            sum1=sum(0,p,nums);
            if(sum2==sum1){
                return p;
                

            }
            
            }return -1;
            
        }
    
    public int sum(int a,int b,int[] nums){
        int sum=0;
        for(int i=a;i<b;i++){
            sum=nums[i]+sum;
            
        }
        return sum;
    }
}