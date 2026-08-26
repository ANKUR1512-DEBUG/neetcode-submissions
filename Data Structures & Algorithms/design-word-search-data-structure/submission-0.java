class WordDictionary {
     class Node {

        Node[] children;
        boolean endOfWord;

        Node() {
            children = new Node[26];
            endOfWord = false;
        }
    }

    Node root;

    public WordDictionary() {
         root = new Node();
    }

    public void addWord(String word) {
         Node curr = root;

        for (int i = 0; i < word.length(); i++) {

            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.endOfWord = true;
    }
    

    public boolean search(String word) {

        return helper(word, 0, root);
    }

    
    public boolean helper(String word, int i, Node curr) {

        
        if (i == word.length()) {
            return curr.endOfWord;
        }

        char ch = word.charAt(i);

        
        if (ch != '.') {

            int idx = ch - 'a';

            
            if (curr.children[idx] == null) {
                return false;
            }

            
            return helper(word, i + 1, curr.children[idx]);
        }

        
        else {

            
            for (int j = 0; j < 26; j++) {

                if (curr.children[j] != null) {

                   
                    if (helper(word, i + 1, curr.children[j])) {
                        return true;
                    }
                }
            }

            return false;
        }
    }
}
