package ds_linkedlist;

public class MyLinkedList<T> {
    INode<T> head;
    INode<T> tail;
    INode<T> currentNode;

    public MyLinkedList(INode<T> head, INode<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    public MyLinkedList() {

    }

    public INode<T> getHead() {
        return head;
    }

    public void setHead(INode<T> head) {
        this.head = head;
    }

    public INode<T> getTail() {
        return tail;
    }

    public void setTail(INode<T> tail) {
        this.tail = tail;
    }

    public void add(INode<T> newNode) {
        if (tail == null) {
            tail = newNode;
        }
        if (head == null) {
            head = newNode;
        } else {
            INode<T> tempNode = head;
            head = newNode;
            head.setNext(tempNode);
        }
    }

    void printList() {
        currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode);
            currentNode = currentNode.getNext();
        }
    }
}
