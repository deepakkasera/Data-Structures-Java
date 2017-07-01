package TrieDS;

import com.sun.org.apache.xpath.internal.SourceTree;
import sun.text.normalizer.Trie;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by deepak on 30/6/17.
 */
public class TrieImplementation {

    static class TrieNode{
        Map<Character , TrieNode> children;
        boolean endOfWord;

        public TrieNode() {
            children = new HashMap<>();
            endOfWord = false;
        }

    }

    private final TrieNode root;

    public TrieImplementation(TrieNode root) {
        this.root = root;
    }

    public void insertWord(String word){
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);

            TrieNode node = current.children.get(ch);
            if(node == null){
                node = new TrieNode();
                current.children.put(ch,node);
            }
            current = node;
        }
        current.endOfWord = true;
    }

    public boolean searchWord(String word){
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if(node == null){
                return false;
            }
            current = node;
        }
        return current.endOfWord;
    }

    public void deleteWord(String word){
        deleteWord(root , word , 0);
    }

    private boolean deleteWord(TrieNode current , String word , int index){

        if(index == word.length()){
            if (current.endOfWord == false){
                return false;
            }
            else{
                current.endOfWord = false;
                return current.children.size() == 0;
            }
        }

        char ch = word.charAt(index);
        TrieNode node = current.children.get(ch);
        if(node == null){
            return false;
        }
        boolean shouldDeleteCurrentNode = deleteWord(current,word,index+1);

        if(shouldDeleteCurrentNode == true){
            current.children.remove(ch);
            return current.children.size() == 0;
        }
        return false;
    }

    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        TrieImplementation trie = new TrieImplementation(root);
        String a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of words to be inserted in trie ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Enter word");
            a = sc.next();
            trie.insertWord(a);
        }
        String search;
        String x;
        int s;
        s = sc.nextInt();
        while ( s != 0 ){
            System.out.println("Enter the element to be searched");
            x = sc.next();
            if (trie.searchWord(x)){
                System.out.println( x + " is present in trie");
            }else{
                System.out.println(x + " is not present in trie");
            }
        }
    }
}
