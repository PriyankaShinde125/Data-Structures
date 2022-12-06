package ds_linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        // Created a simple Linked list.
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        System.out.println(firstNode.getKey()+"->"+firstNode.getNext().getKey()+"->"+firstNode.getNext().getNext().getKey());
    }
}