package ds_linkedlist;

public class MyNode<T> implements INode<T> {
    T key;
    INode<T> next;

    public MyNode(T key) {
        this.key = key;
        this.next = null;
    }

    public MyNode(T key, INode<T> next) {
        this.key = key;
        this.next = next;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public INode<T> getNext() {
        return next;
    }

    public void setNext(INode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        String nodeString = "" + key;
        if (next != null)
            nodeString = nodeString + "->";
        return nodeString;
    }
}
