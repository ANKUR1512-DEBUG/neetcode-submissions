class RandomizedSet {

    ArrayList<Integer> list;
    HashMap<Integer, Integer> map;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    public boolean insert(int val) {

        if(map.containsKey(val)) {
            return false;
        }

        list.add(val);
        map.put(val, list.size() - 1);

        return true;
    }

    public boolean remove(int val) {

        if(!map.containsKey(val)) {
            return false;
        }

        int index = map.get(val);

        int last = list.get(list.size() - 1);

        list.set(index, last);

        map.put(last, index);

        list.remove(list.size() - 1);

        map.remove(val);

        return true;
    }

    public int getRandom() {

        Random rand = new Random();

        int index = rand.nextInt(list.size());

        return list.get(index);
    }
}