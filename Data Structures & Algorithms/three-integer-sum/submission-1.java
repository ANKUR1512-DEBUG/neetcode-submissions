class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int t=nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<t;i++){
            for(int j=i+1;j<t;j++){
                for(int k=j+1;k<t;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(temp);
                        set.add(temp);
                    }


                }
            }
        }return new ArrayList<>(set);
    }
}
