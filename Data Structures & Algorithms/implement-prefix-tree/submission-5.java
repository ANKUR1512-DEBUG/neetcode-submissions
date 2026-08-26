class PrefixTree {
    class Node{
        Node[] children;
        boolean endOfWord;
        Node(){
            children=new Node[26];
            endOfWord=false;
        }

    }
    Node root;

    public PrefixTree() {
         root=new Node();
    }

    public void insert(String word) {
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.endOfWord=true;

    }

    public boolean search(String word) {

Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.endOfWord;
    }

    public boolean startsWith(String prefix) {
        Node curr=root;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;

    }
}
