package Impl.Trie.TrieImpl;

import Impl.Trie.TrieInterface.TrieInterface;

public class TriePractise implements TrieInterface {

    TrieNode root = null;
    public TriePractise() {
        root = new TrieNode();
    }

    @Override
    public void insert(String word) {
        TrieNode currNode = root;
        for(char ch: word.toCharArray()) {
            if(currNode.children[ch-'a'] == null) {
                currNode.children[ch-'a'] = new TrieNode();
            }
            currNode = currNode.children[ch-'a'];
        }
        currNode.isWord = true;
    }

    @Override
    public boolean search(String word) {
        TrieNode currNode = root;
        for(char ch: word.toCharArray()) {
            if(currNode.children[ch-'a'] == null) {
                return false;
            }
            currNode = currNode.children[ch-'a'];
        }
        return currNode.isWord;
    }

    @Override
    public boolean checkString(String word) {
        TrieNode currNode = root;
        for(char ch: word.toCharArray()) {
            if(currNode.children[ch-'a'] == null) {
                return false;
            }
            currNode = currNode.children[ch-'a'];
        }
        return true;
    }

    @Override
    public void printTrieStrings() {

    }

    public class TrieNode {
        TrieNode[] children;
        boolean isWord;
        public TrieNode() {
            children = new TrieNode[26];
            isWord = false;
        }
    }
}
