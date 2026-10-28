class Solution {
    public int[] findMissingAndRepeatedValues(int[][] nums) {
        int n=nums.length;
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int k=0;k<nums.length;k++){
                if(!set.contains(nums[i][k])){
                set.add(nums[i][k]);
            }
            else{
                list.add(nums[i][k]);
            }
            }

        }
        for(int j=1;j<n*n+1;j++){
            if(!set.contains(j)){
                list.add(j);
            }
        }int[] arr = new int[list.size()];

for (int i = 0; i < list.size(); i++) {
    arr[i] = list.get(i);
}return arr;
        
    }
}