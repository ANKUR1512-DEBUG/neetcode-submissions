class Solution {
    public int minimumRecolors(String blocks, int k) {
        int currentW = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                currentW++;
            }
        }
        
        int minW = currentW;
        for (int i = k; i < blocks.length(); i++) {
       
            if (blocks.charAt(i) == 'W') {
                currentW++;
            }
            if (blocks.charAt(i - k) == 'W') {
                currentW--;
            }
            minW = Math.min(minW, currentW);
        }
        
        return minW;
    }
}
