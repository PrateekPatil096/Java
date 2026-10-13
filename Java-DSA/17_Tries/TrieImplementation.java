import java.util.*;

public class TrieImplementation {
    
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord = false;
    }
    
    static TrieNode root;
    
    public static void main(String[] args) {
        root = new TrieNode();
        
        // Insert words
        insert("apple");
        insert("app");
        insert("application");
        insert("bat");
        insert("ball");
        
        // Search words
        System.out.println("Search 'apple': " + search("apple"));
        System.out.println("Search 'app': " + search("app"));
        System.out.println("Search 'appl': " + search("appl"));
        
        // Prefix search
        System.out.println("Starts with 'app': " + startsWith("app"));
        System.out.println("Starts with 'bal': " + startsWith("bal"));
        System.out.println("Starts with 'cat': " + startsWith("cat"));
    }
    
    static void insert(String word) {
        TrieNode node = root;
        
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) {
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx];
        }
        
        node.isEndOfWord = true;
    }
    
    static boolean search(String word) {
        TrieNode node = searchNode(word);
        return node != null && node.isEndOfWord;
    }
    
    static boolean startsWith(String prefix) {
        return searchNode(prefix) != null;
    }
    
    static TrieNode searchNode(String word) {
        TrieNode node = root;
        
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) {
                return null;
            }
            node = node.children[idx];
        }
        
        return node;
    }
}
