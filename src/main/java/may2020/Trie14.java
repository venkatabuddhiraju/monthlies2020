package may2020;

/**
 *
 * Implement Trie (Prefix Tree)
 * Implement a trie with insert, search, and startsWith methods.
 *
 * Example:
 *
 * Trie trie = new Trie();
 *
 * trie.insert("apple");
 * trie.search("apple");   // returns true
 * trie.search("app");     // returns false
 * trie.startsWith("app"); // returns true
 * trie.insert("app");
 * trie.search("app");     // returns true
 * Note:
 *
 * You may assume that all inputs are consist of lowercase letters a-z.
 * All inputs are guaranteed to be non-empty strings.
 */
public class Trie14 {

    TrieNode root;

    /** Initialize your data structure here. */
    public Trie14() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode head = root;
        if(word.isBlank()){
            return;
        }
        for(Character c : word.toCharArray()){
            if(!head.containsKey(c)){
                head.put(c, new TrieNode());
            }
            head = head.get(c);
        }
        head.setEnd();
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(word.isBlank()){
            return false;
        }
        TrieNode head = root;
        for(Character c : word.toCharArray()) {
            if(!head.containsKey(c)){
                return false;
            }
            head = head.get(c);
        }
        if(!head.isEnd()){
            return false;
        }
        return true;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if(prefix.isBlank()){
            return false;
        }
        TrieNode head = root;
        for(Character c : prefix.toCharArray()) {
            if(!head.containsKey(c)){
                return false;
            }
            head = head.get(c);
        }
        return true;
    }

    public static void main(String[] asdsds){
        Trie14 obj = new Trie14();
        obj.insert("word");
        System.out.println(obj.search("word"));
        System.out.println(obj.startsWith("w"));
        obj.insert("doggy");
        System.out.println(obj.startsWith("w"));
        System.out.println(obj.startsWith("dog"));
        System.out.println(obj.search("dog"));
    }

    private static class TrieNode {

        // R links to node children
        private TrieNode[] links;

        private final int R = 26;

        private boolean isEnd;

        public TrieNode() {
            links = new TrieNode[R];
        }

        public boolean containsKey(char ch) {
            return links[ch -'a'] != null;
        }
        public TrieNode get(char ch) {
            return links[ch -'a'];
        }
        public void put(char ch, TrieNode node) {
            if(links[ch -'a'] != null){
                return;
            }
            links[ch -'a'] = node;
        }
        public void setEnd() {
            isEnd = true;
        }
        public boolean isEnd() {
            return isEnd;
        }
    }

}
