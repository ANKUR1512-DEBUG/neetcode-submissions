class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        
        int l=nums2.length-1;
        
        
        for(int i=0;i<nums1.length;i++){
            int x=nums1[i];
            int z=0;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==x){
                    z=j;
                    break;
                }

            }

            arr[i]=-1;
            for (int k = z + 1; k < nums2.length; k++) {
                if (nums2[k] > x) {
                    arr[i] = nums2[k];
                    break;
                }
        }
        }return arr;

    }
}