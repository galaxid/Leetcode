class Trie {   //not finished

    /** Initialize your data structure here. */
    public Trie() {
        String val;
        Trie next;
        
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        while(Trie.next!=null){
            Trie=Trie.next;
        }
        Trie.next= new Trie;
        Trie.next.val=word;
        
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        while(Trie!=null){
            if(Trie.val.equals(word))return true;
            Trie=Trie.next;
        }
        return false;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        while(Trie!=null){
            String cur=Trie.val.substring(prefix.length());
            if(cur.equals(prefix))return true;
            Trie=Trie.next;
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */