/*
 * INTERVIEW QUESTIONS - Trie (Prefix Tree):
 *
 * Q1: What is a Trie?
 * A: Tree-like structure for storing strings; each node represents a character
 *
 * Q2: What does Trie stand for?
 * A: From "retrieval" - pronounced "try"
 *
 * Q3: Time complexity of insert/search?
 * A: O(L) where L is length of the word
 *
 * Q4: What is 'eow' (end of word)?
 * A: Flag indicating a complete word ends at this node
 *
 * Q5: Why array of size 26?
 * A: One slot for each lowercase letter (a-z)
 *
 * Q6: Applications of Trie?
 * A: Autocomplete, spell checker, IP routing, word games
 *
 * Q7: What is startsWith/prefix search?
 * A: Check if any word starts with given prefix - O(prefix length)
 */


public class trie {
    static  class Node{
        Node[] children;  // Q: Why 26? A: One for each letter a-z
        boolean eow;      // Q: What is eow? A: End of word marker

    public  Node(){
        children=new Node[26];
        for(int i=0;i<26;i++){
            children[i]=null;
        }
        eow=false;
    }
}
    static Node root=new Node();

    // Q: How does insert work? A: Create nodes for each character
    public static void insert(String words){
        Node curr=root;
        for(int i=0;i<words.length();i++){
            int idx=words.charAt(i)-'a';  // Q: What is this? A: Convert char to index (0-25)
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();  // Create new node if not exists
            }
            if(i==words.length()-1){
                curr.children[idx].eow=true;  // Mark end of word
            }
            curr=curr.children[idx];  // Move to next node
        }
    }

    // Q: How does search work? A: Follow character path, check eow at end
    public static boolean search(String key) {
        Node curr=root;

    for(int i = 0; i < key.length(); i++) {

        int idx = key.charAt(i) - 'a';
        Node node = curr.children[idx];

        if(node == null) {
            return false;  // Character not found
        }

        // Q: Why check eow at last character?
        // A: Word might be prefix of another (e.g., "app" in "apple")
        if(i == key.length() - 1 && node.eow == false) {
            return false;
        }

        curr = curr.children[idx];
    }

    return true;
}

// Q: What is word break problem?
// A: Check if string can be segmented into dictionary words
public static boolean wordbreak(String key){
    if(key.length()==0){
        return true;  // Empty string is valid
    }
    for(int i=1;i<=key.length();i++){
        String firstpart=key.substring(0,i);
        String secpart=key.substring(i);
        // Q: If first part is word AND rest can be broken, return true
        if(search(firstpart)&& wordbreak(secpart)){
            return true;
        }
    }
    return false;
}

    // Q: What is startsWith? A: Check if any word starts with prefix
    public static boolean startsWith(String prefix) {
    Node curr = root;

    for (int i = 0; i < prefix.length(); i++) {
        int idx = prefix.charAt(i) - 'a';

        if (curr.children[idx] == null) {
            return false;
        }

        curr = curr.children[idx];
    }

    return true;  // Q: Why no eow check? A: We only need prefix match
}

// Q: How to count total nodes in Trie?
public static int countNode(Node root){
    if(root==null){
        return 0;
    }
    int count=0;
    for(int i=0;i<26;i++){
        if(root.children[i]!=null){
            count+=countNode(root.children[i]);
        }
    }
    return count+1;  // +1 for current node
}

public static String ans="";

// Q: How to find longest word with all prefixes valid?
public static void longestWord(Node root, StringBuilder temp) {

    if (root == null) {
        return;
    }

    for (int i = 0; i < 26; i++) {

        // Q: Why check eow? A: Every prefix must be a valid word
        if (root.children[i] != null &&
            root.children[i].eow == true) {

            temp.append((char)(i + 'a'));

            if (temp.length() > ans.length()) {
                ans = temp.toString();
            }

            longestWord(root.children[i], temp);

            temp.deleteCharAt(temp.length() - 1);  // Backtrack
        }
    }
}

    public static void main(String[] args) {
        String words[]={"a","banana","app","appl","ap","apply","apple"};

       for(int i=0;i<words.length;i++){
        insert(words[i]);
       }
       longestWord(root, new StringBuilder(""));
       System.out.println(ans);  // Output: apple

    }

}
