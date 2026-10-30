class Solution {
    public String pushDominoes(String dominoes) {

        String s = "L" + dominoes + "R";
        char[] arr = s.toCharArray();

        int prev = 0;

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] == '.') {
                continue;
            }

            if(arr[prev] == arr[i]) {
                for(int k = prev + 1; k < i; k++) {
                    arr[k] = arr[i];
                }
            }

            else if(arr[prev] == 'R' && arr[i] == 'L') {
                int left = prev + 1;
                int right = i - 1;

                while(left < right) {
                    arr[left] = 'R';
                    arr[right] = 'L';

                    left++;
                    right--;
                }
            }

            prev = i;
        }

        return new String(arr, 1, arr.length - 2);
    }
}
