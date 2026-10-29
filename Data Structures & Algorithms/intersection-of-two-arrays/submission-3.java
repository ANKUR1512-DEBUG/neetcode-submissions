class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            int x=nums1[i];
            if(!set.contains(x)){
                set.add(x);
            }
        }
        HashSet<Integer> result = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            int z=nums2[i];
            if(set.contains(z)){
                result.add(z);

            }
            
        }
        int[] arr=new int[result.size()];
        int i=0;
        for(Integer x:result){
            arr[i]=x;
            i++;
        }return arr;
    }
}