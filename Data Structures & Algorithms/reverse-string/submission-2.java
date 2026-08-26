class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        char t=0;
        while(left<right){
            
            t=s[right];
            s[right]=s[left];
            s[left]=t;
            left++;
            right--;
            
        }
    }
}