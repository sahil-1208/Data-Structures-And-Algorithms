package hashmap;

import java.util.*;

public class HashMapImp<K, V> {

    private int nodes;  // LL Nodes
    private int bLength; // buckets length
    private LinkedList<Node> buckets[];

    public HashMapImp() {
        this.bLength = 4;
        this.buckets = new LinkedList[4];

        for (int index = 0; index < 4; index++) {
            this.buckets[index] = new LinkedList<>();
        }
    }

    private class Node {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int hashFunction(K key) {
        int bucketIndex = key.hashCode();
        return Math.abs(bucketIndex) % bLength;

    }

    private int searchInLL(K key, int bucketIndex) {
        LinkedList<Node> ll = buckets[bucketIndex];
        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i).key == key) return i;
        }
        return -1;
    }

    private void rehash() {
        LinkedList<Node>[] oldBuckets = buckets;
        buckets = new LinkedList[bLength * 2];

        for (int index = 0; index < bLength * 2; index++) {
            buckets[index] = new LinkedList<>();
        }

        for (int i = 0; i < oldBuckets.length; i++) {
            LinkedList<Node> oldBucketList = oldBuckets[i];
            for (int j = 0; j < oldBucketList.size(); j++) {
                Node node = oldBucketList.get(j);
                put(node.key, node.value);
            }
        }
    }

    public void put(K key, V value) {
        int bucketIndex = hashFunction(key);
        int nodeIndex = searchInLL(key, bucketIndex);
        if (nodeIndex == -1) {
            buckets[bucketIndex].add(new Node(key, value));
            nodes++;
        } else {
            Node updatedNode = buckets[bucketIndex].get(nodeIndex);
            updatedNode.value = value;
        }

        double lambda = (double) nodes / bLength;
        if (lambda > 2.0) {
            rehash();
        }
    }

    public boolean containsKey(K key) {
        int bucketIndex = hashFunction(key);
        int nodeIndex = searchInLL(key, bucketIndex);
        if (nodeIndex == -1) {
            return false;
        }
        return true;
    }

    public V remove(K key) {
        int bucketIndex = hashFunction(key);
        int nodeIndex = searchInLL(key, bucketIndex);
        if (nodeIndex == -1) return null;
        Node removedNode = buckets[bucketIndex].remove(nodeIndex);
        nodes--;
        return removedNode.value;
    }

    public V get(K key) {
        int bucketIndex = hashFunction(key);
        int nodeIndex = searchInLL(key, bucketIndex);
        if (nodeIndex == -1) return null;
        Node fetchedNode = buckets[bucketIndex].get(nodeIndex);
        return fetchedNode.value;
    }

    public ArrayList<K> keySet() {
        ArrayList<K> keys = new ArrayList<>();
        for (int i = 0; i < buckets.length; i++) {
            LinkedList<Node> bucketList = buckets[i];
            for (int j = 0; j < bucketList.size(); j++) {
                Node node = bucketList.get(j);
                keys.add(node.key);
            }
        }
        return keys;
    }

    public boolean isEmpty() {
        return nodes == 0;
    }
}

/*PUT
   hash function - b[index]
    LL Search  - d[index]
    if key doesn't exist = create new node
    if exist - update
    check threshold value
    if lambda > threshold - rehash
* */
