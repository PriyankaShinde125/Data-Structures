package ds_linkedlist;

public class MyNode<T> implements INode<T>{
    T key;
    MyNode<T> next;

    public MyNode(T key) {
        this.key = key;
        this.next = null;
    }

    public MyNode(T key, MyNode<T> next) {
        this.key = key;
        this.next = next;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }
}
