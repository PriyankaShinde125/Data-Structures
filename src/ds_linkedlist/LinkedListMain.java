package ds_linkedlist;

import java.util.Scanner;

public class LinkedListMain {
    public static final int ADD_FIRST = 1;
    public static final int APPEND = 2;
    public static final int INSERT_BETWEEN_TWO = 3;
    public static final int POP_FIRST = 4;
    private static final int POP_LAST = 5;
    public static final int SEARCH =6;
    public static final int EXIT = 0;

    MyLinkedList<Integer> list;

    public static void main(String[] args) {
        LinkedListMain main = new LinkedListMain();
        main.list = new MyLinkedList<>();
        INode<Integer> myNode;
        while (true) {
            System.out.println("Enter your choice : \n1 : Add at first\n2 : Add at last\n3 : Insert between two nodes\n4 : Pop first\n5 : Pop last\n6 : Search \n0 : Exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case ADD_FIRST:
                    System.out.println("Enter element to add at first : ");
                    myNode = new MyNode<>(sc.nextInt());
                    main.list.add(myNode);
                    System.out.println(main.list);
                    break;
                case APPEND:
                    System.out.println("Enter element to add at Last : ");
                    myNode = new MyNode<>(sc.nextInt());
                    main.list.append(myNode);
                    System.out.println(main.list);
                    break;
                case INSERT_BETWEEN_TWO:
                    System.out.println("Enter first Node : ");
                    INode<Integer> firstNode = new MyNode<>(sc.nextInt());
                    System.out.println("Enter second node : ");
                    INode<Integer> secondNode = new MyNode<>(sc.nextInt());
                    System.out.println("Enter node to insert : ");
                    myNode = new MyNode<>(sc.nextInt());
                    main.list.insert(firstNode, myNode, secondNode);
                    System.out.println(main.list);
                    break;
                case POP_FIRST:
                    System.out.println("\nDeleted : " + main.list.popFirst());
                    System.out.println(main.list);
                    break;
                case POP_LAST:
                    System.out.println("\nDeleted : " + main.list.popLast());
                    System.out.println(main.list);
                    break;
                case SEARCH:
                    System.out.println("Enter key to search in linked list");
                    System.out.println(main.list.search(new MyNode<>(sc.nextInt())) ? "Key found" : "Key not found");
                    break;
                case EXIT:
                    return;
            }
        }
    }
}