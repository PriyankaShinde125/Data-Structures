package ds_queue;

import ds_linkedlist.INode;
import ds_linkedlist.MyLinkedList;

public class MyQueue<T> {
    MyLinkedList<T> myQueue;
    public MyQueue() {
        myQueue =new MyLinkedList<>();
    }
    public void enqueue(INode<T> element) {
        myQueue.append(element);
    }

    @Override
    public String toString() {
        return  myQueue.toString();
    }
}
