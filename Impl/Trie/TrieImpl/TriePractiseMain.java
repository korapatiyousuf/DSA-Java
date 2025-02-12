package Impl.Trie.TrieImpl;

import Impl.Trie.TrieInterface.TrieInterface;

public class TriePractiseMain {
    public static void main(String[] args) {
        TrieInterface trie = new TriePractise();
        String[] strings = {"java", "javelin", "linkedin", "alphabets"};
        for(String str: strings) {
            trie.insert(str);
        }

        System.out.println("search -> elephant: " +trie.search("elephant"));
        System.out.println("search -> alphabets: " +trie.search("alphabets"));

        System.out.println("check -> linked: " +trie.checkString("linked"));
    }
}
