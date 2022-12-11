package hashtable;

import linkedlist.MyLinkedList;
import linkedlist.MyNode;

public class MyHashMap<T extends Comparable<T>, V> {
    MyLinkedList<T> myHashMap;

    public MyHashMap() {
        myHashMap = new MyLinkedList<>();
    }

    public V get(T key) {
        MyMapNode<T, V> myMapNode = (MyMapNode<T, V>) myHashMap.search(new MyNode<>(key));
        return myMapNode == null ? null : myMapNode.getValue();
    }

    public void add(T key, V value) {
        MyMapNode<T, V> myMapNode = (MyMapNode<T, V>) myHashMap.search(new MyNode<T>(key));
        if (myMapNode == null) {
            myMapNode = new MyMapNode<>(key, value);
            myHashMap.append(myMapNode);
        }else {
            myMapNode.setValue(value);
        }
    }

    @Override
    public String toString() {
        return  myHashMap.toString();
    }
}
