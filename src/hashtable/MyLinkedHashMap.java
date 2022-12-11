package hashtable;

import linkedlist.INode;
import linkedlist.MyLinkedList;
import linkedlist.MyNode;
import java.util.ArrayList;

public class MyLinkedHashMap<T extends Comparable, V> {
    int numOfBuckets;
    ArrayList<MyLinkedList<T>> bucketArrayList;

    public MyLinkedHashMap() {
        numOfBuckets = 10;
        bucketArrayList = new ArrayList<>(numOfBuckets);
        for (int i = 0; i < numOfBuckets; i++) {
            bucketArrayList.add(null);
        }
    }

    int getIndex(T key) {
        int hashCode = Math.abs(key.hashCode());
        int index = hashCode % numOfBuckets;
        return index;
    }

    public V get(T key) {
        int index = getIndex(key);
        MyLinkedList<T> myLinkedList = bucketArrayList.get(index);
        if (myLinkedList == null)
            return null;
        MyMapNode<T, V> myMapNode = (MyMapNode<T, V>) myLinkedList.search(new MyNode<T>(key));
        return myMapNode == null ? null : myMapNode.getValue();
    }

    public void add(T key, V value) {
        int index = getIndex(key);
        MyLinkedList<T> myLinkedList = bucketArrayList.get(index);
        if (myLinkedList == null) {
            myLinkedList = new MyLinkedList<>();
            bucketArrayList.set(index, myLinkedList);
        }
            MyMapNode<T, V> myMapNode = (MyMapNode<T, V>) myLinkedList.search(new MyNode<T>(key));
            if (myMapNode == null) {
                myMapNode = new MyMapNode<>(key, value);
                myLinkedList.append((INode) myMapNode);
            } else {
                myMapNode.setValue(value);
            }
    }

    public INode<T> remove(T key) {
        int index = getIndex(key);
        MyLinkedList<T> myLinkedList = bucketArrayList.get(index);
        MyMapNode<T, V> myMapNode = (MyMapNode<T, V>) myLinkedList.search(new MyNode<T>(key));
        if (myMapNode == null) {
            return null;
        }
        myLinkedList.delete(myMapNode);
        return myMapNode;
    }

    @Override
    public String toString() {
        String hashMap = "";
        for (int i = 0; i < numOfBuckets; i++) {
            hashMap = hashMap + bucketArrayList.get(i);
        }
        return hashMap;
    }
}
