class MyHashMap {

    class Pair {
        int key, value;
        boolean deleted;

        Pair(int k, int v) {
            key = k;
            value = v;
            deleted = false;
        }
    }

    private int size = 1000;
    private Pair[] arr;

    public MyHashMap() {
        arr = new Pair[size];
    }

    private int hash(int key) {
        return key % size;
    }

    // 🔹 PUT
    public void put(int key, int value) {
        int i = hash(key);

        while (arr[i] != null && !arr[i].deleted && arr[i].key != key) {
            i = (i + 1) % size;
        }

        arr[i] = new Pair(key, value);
    }

    // 🔹 GET
    public int get(int key) {
        int i = hash(key);

        while (arr[i] != null) {
            if (!arr[i].deleted && arr[i].key == key) {
                return arr[i].value;
            }
            i = (i + 1) % size;
        }

        return -1;
    }

    // 🔹 REMOVE
    public void remove(int key) {
        int i = hash(key);

        while (arr[i] != null) {
            if (!arr[i].deleted && arr[i].key == key) {
                arr[i].deleted = true; // mark deleted
                return;
            }
            i = (i + 1) % size;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */