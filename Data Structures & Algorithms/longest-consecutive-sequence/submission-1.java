class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int longest=0;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(!set.contains(num-1)){
                int current=num;
                int length=1;
                while(set.contains(current+1)){
                    current++;
                    length++;
                }
                longest=Math.max(length,longest);

            }
        }return longest;
        
       
    }
}
