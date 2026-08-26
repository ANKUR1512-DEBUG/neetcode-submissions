class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int size=nums.length;
        int count=0;
        for(int i=0;i<size;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)>size/3){
                result.add(key);
            }
        }
            
        
        return result;
    }
}