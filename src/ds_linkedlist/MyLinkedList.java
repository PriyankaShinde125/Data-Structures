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
            setTail(newNode);
        }
        if (head == null) {
            setHead(newNode);
        } else {
            INode<T> tempNode = head;
            setHead(newNode);
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

    public void append(INode<T> newNode) {
        if (head == null) {
            setHead(newNode);
        }
        if (tail == null) {
            setTail(newNode);
        } else {
            INode<T> tempNode = getTail();
            setTail(newNode);
            tempNode.setNext(tail);
        }
    }

    public void insert(INode<T> firstNode, INode<T> newNode, INode<T> secondNode) {
        if (head == null || tail == head) {
            setHead(firstNode);
            head.setNext(newNode);
            setTail(secondNode);
            newNode.setNext(tail);
        }
        else {
            firstNode.setNext(newNode);
            newNode.setNext(secondNode);
        }
    }
}
