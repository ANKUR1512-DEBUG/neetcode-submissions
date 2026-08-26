class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        int r=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<r;i++){
            if(map.containsKey(nums[i])){
                int l=i- map.get(nums[i]);
                if(k>=l){
                    return true;
                }

            }
            map.put(nums[i],i);
            
        }return false;
    }
}