package queue;

import linkedlist.INode;
import linkedlist.MyLinkedList;

public class MyQueue<T> {
    MyLinkedList<T> myQueue;

    public MyQueue() {
        myQueue = new MyLinkedList<>();
    }

    public void enqueue(INode<T> element) {
        myQueue.append(element);
    }

    @Override
    public String toString() {
        return myQueue.toString();
    }

    public INode<T> dequeue() {
        return myQueue.popFirst();
    }

    public boolean isEmpty() {
        return myQueue.isEmpty();
    }

    public int size() {
        return myQueue.size();
    }
}
