package hashing;

import java.util.*;

public class HashTable<K, V> {

    private class HTPair {
        K key;
        V value;

        public HTPair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public boolean equals(Object obj) {
            HTPair op = (HTPair) obj;
            return this.key.equals(op.key);
        }

        public String toString() {
            return "{" + this.key + ":" + this.value + "}";
        }
    }

    public static final int DEFAULT_CAPACITY = 10;
    private LinkedList<HTPair>[] bucketArray;
    private int size;

    public HashTable() {
        this(DEFAULT_CAPACITY);
    }

    public HashTable(int capacity) {
        this.bucketArray = (LinkedList<HTPair>[]) new LinkedList[capacity];
        this.size = 0;
    }

    private int hashFunction(K key) {
        int hc = key.hashCode();
        hc = Math.abs(hc);
        int bi = hc % this.bucketArray.length;
        return bi;
    }

    public void put(K key, V value) throws Exception {

    }

}
