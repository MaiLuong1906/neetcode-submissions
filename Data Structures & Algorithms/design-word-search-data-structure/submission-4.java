
    class TrieNode{
        TrieNode[] child = new TrieNode[26];
        boolean isEnd = false;
    }
    class WordDictionary {
        TrieNode root;
        public WordDictionary() {
            root = new TrieNode();
        }

        public void addWord(String word) {
            TrieNode cur = root;
            for(char c: word.toCharArray()){
                int i = c - 'a';
                if(cur.child[i] == null) cur.child[i] = new TrieNode();
                cur = cur.child[i];
            }
            cur.isEnd = true;
        }

        public boolean search(String word) {
            return dfs(word, 0, root);
        }
        public boolean dfs(String word, int i, TrieNode node){
            if(i == word.length()) return node.isEnd;

            char c = word.charAt(i);
            if(c != '.'){
                int index = c - 'a';
                if(node.child[index] == null) return false;

                return dfs(word, i + 1, node.child[index]);
            }
            for(TrieNode child: node.child){
                if(child != null && dfs(word, i + 1, child)) return true;
            }
            return false;
        }
    }
