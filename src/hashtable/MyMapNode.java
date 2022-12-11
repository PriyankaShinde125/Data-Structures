package hashtable;

import linkedlist.INode;

public class MyMapNode<T, V> implements INode<T> {
    T key;
    V value;
    MyMapNode<T, V> next;

    public MyMapNode() {
        this.key = null;
        this.value = null;
        this.next = null;
    }

    public MyMapNode(T key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    @Override
    public T getKey() {
        return key;
    }

    @Override
    public void setKey(T key) {
        this.key = key;
    }

    @Override
    public INode<T> getNext() {
        return next;
    }

    @Override
    public void setNext(INode<T> next) {
        this.next = (MyMapNode<T, V>) next;
    }

    @Override
    public int compareTo(INode<T> o) {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder mapNodeString = new StringBuilder();
        mapNodeString.append(key + "->" + value + "\n");
        if (next != null)
            mapNodeString = mapNodeString.append(next);
        return mapNodeString.toString();
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
