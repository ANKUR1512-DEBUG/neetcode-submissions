class Solution {
    public int leastBricks(List<List<Integer>> wall) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int max = 0;

        for(int i = 0; i < wall.size(); i++) {

            int sum = 0;

            for(int j = 0; j < wall.get(i).size() - 1; j++) {

                sum += wall.get(i).get(j);

                if(map.containsKey(sum)) {
                    map.put(sum, map.get(sum) + 1);
                }
                else {
                    map.put(sum, 1);
                }

                max = Math.max(max, map.get(sum));
            }
        }

        return wall.size() - max;
    }
}