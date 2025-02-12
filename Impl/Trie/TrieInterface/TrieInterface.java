package Impl.Trie.TrieInterface;

public interface TrieInterface {
    //insert a word/string in trie data structure
    void insert(String word);

    //search a word in trie data structure
    boolean search(String word);

    //check if string is available in trie
    boolean checkString(String word);

    //print all strings in trie
    void printTrieStrings();

    //delete
}
