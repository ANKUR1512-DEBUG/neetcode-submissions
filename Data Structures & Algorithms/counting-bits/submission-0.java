class Solution {
    public int[] countBits(int n) {

        int[] arr = new int[n + 1];

        for (int i = 0; i <= n; i++) {

            int num = i;      // copy i
            int count = 0;

            while (num != 0) {
                num = num & (num - 1);  // remove one 1 bit
                count++;
            }

            arr[i] = count;
        }

        return arr;
    }
}
