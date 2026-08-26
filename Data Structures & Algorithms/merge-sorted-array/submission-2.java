class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // copy nums2 into nums1
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        // sort nums1
        java.util.Arrays.sort(nums1);
    }
}