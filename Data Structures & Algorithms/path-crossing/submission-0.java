class Solution {
    public boolean isPathCrossing(String path) {

        HashSet<String> set = new HashSet<>();

        int x = 0;
        int y = 0;

        set.add(x + "," + y);

        for(int i = 0; i < path.length(); i++) {

            char ch = path.charAt(i);

            if(ch == 'N') {
                y++;
            }
            else if(ch == 'S') {
                y--;
            }
            else if(ch == 'E') {
                x++;
            }
            else if(ch == 'W') {
                x--;
            }

            String pos = x + "," + y;

            if(!set.add(pos)) {
                return true;
            }
        }

        return false;
    }
}