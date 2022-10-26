package algorithmInClass.hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashTable {
    class Node{
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }
    private int size = 10000;
    List<Node>[] table = new ArrayList[size];

    public HashTable() {
    }

    public HashTable(int size) {
        this.size = size;
        this.table = new ArrayList[size];
    }

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum = key.charAt(i);
        }
        return asciiSum % size;
    }

    public void insert(String key, Integer value) {
        int hashIdx = hash(key);
        if(this.table[hashIdx]==null){
            this.table[hashIdx]=new ArrayList<>();
        }
        this.table[hashIdx].add(new Node(key,value));
    }

    public Integer search(String key) {
        List<Node> nodes = this.table[hash(key)];
        for (Node node : nodes) {
            if(key.equals(node.getKey())){
                return node.value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable(1000);
        ht.insert("hi",1);
        ht.insert("ih",2);

        if(ht.search("ih")==2){
            System.out.println("good");
        }

    }
}