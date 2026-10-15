class TrieNode{
    TrieNode[] child = new TrieNode[26];
    boolean isEnd = false;
}
class PrefixTree {
    TrieNode root;
    public PrefixTree() {
         root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode cur = root;
        for(char c: word.toCharArray()){
            int i = c - 'a';
            if(cur.child[i] == null) cur.child[i] = new TrieNode();
            cur = cur.child[i];
        }
        cur.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode cur = root;
        for(char c: word.toCharArray()){
            int i = c - 'a';
            if(cur.child[i] == null) return false;
            cur = cur.child[i];
        }
        return cur.isEnd;
    }

    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for(char c: prefix.toCharArray()){
            int i = c - 'a';
            if(cur.child[i] == null) return false;
            cur = cur.child[i];
        }
        return true;
    }
}
