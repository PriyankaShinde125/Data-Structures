package ds_linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        INode<Integer> firstNode = new MyNode<>(56);
        INode<Integer> secondNode = new MyNode<>(70);
        INode<Integer> newNode = new MyNode<>(30);
        list.add(secondNode);
        list.add(firstNode);
        list.insert(firstNode, newNode, secondNode);
        list.printList();
    }
}