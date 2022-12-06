package ds_linkedlist;

public interface INode<T> {
    T getKey();

    void setKey(T key);

    MyNode<T> getNext();

    void setNext(MyNode<T> next);
}
