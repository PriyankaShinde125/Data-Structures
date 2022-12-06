package ds_linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
       MyLinkedList<Integer> list=new MyLinkedList<>();
       list.add(new MyNode(56));
       list.append(new MyNode<>(30));
       list.append(new MyNode<>(70));
       list.printList();
    }
}