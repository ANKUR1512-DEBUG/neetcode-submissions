class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        if(nums.length%2!=0){
            return false;
        }
        else{
            for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for (int value : map.values()) {
    if (value % 2 != 0) {
        return false;
    }
    

}
        }return true;
        

    }
}