class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }

        }
        for(int j=1;j<nums.length+1;j++){
            if(!set.contains(j)){
                list.add(j);
            }
        }return list;
        
        
    }
}