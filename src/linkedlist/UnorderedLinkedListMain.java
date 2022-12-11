package linkedlist;

import java.util.Scanner;

public class UnorderedLinkedListMain {
    public static final int ADD_FIRST = 1;
    public static final int APPEND = 2;
    public static final int INSERT_BETWEEN_TWO = 3;
    public static final int POP_FIRST = 4;
    private static final int POP_LAST = 5;
    public static final int SEARCH = 6;
    public static final int INSERT_AFTER_SPECIFIC_NODE = 7;
    public static final int DELETE_NODE = 8;
    public static final int FIND_INDEX = 9;
    public static final int IS_EMPTY = 10;
    public static final int GET_ELEMENT_AT_INDEX = 11;

    public static final int REMOVE_ELEMENT_FROM_INDEX = 12;
    public static final int EXIT = 0;

    MyLinkedList<Integer> list;

    public static void main(String[] args) {
        UnorderedLinkedListMain main = new UnorderedLinkedListMain();
        main.list = new MyLinkedList<>();
        INode<Integer> myNode;
        while (true) {
            System.out.println("Enter your choice : \n1 : Add at first\n2 : Append at last\n3 : Insert between two nodes\n4 : Pop first\n5 : Pop last\n6 : Search\n7 : Insert after given node\n8 : Delete node" +
                    "\n9 : Find index of node\n10 : Check list is empty\n11 : Get element of given index\n12 : Remove element from index\n0 : Exit");
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
                    System.out.println( (myNode=main.list.popFirst()) == null ? "List is empty" : "\nDeleted : " +myNode+"\n"+main.list);
                    break;
                case POP_LAST:
                    System.out.println("\nDeleted : " + main.list.popLast());
                    System.out.println(main.list);
                    break;
                case SEARCH:
                    System.out.println("Enter key to search in linked list");
                    System.out.println(main.list.search(new MyNode<>(sc.nextInt())) != null ? "Key found" : "Key not found");
                    break;
                case INSERT_AFTER_SPECIFIC_NODE:
                    System.out.println("Enter node to insert ");
                    myNode = new MyNode<>(sc.nextInt());
                    System.out.println("After which node do you want to insert ? ");
                    INode<Integer> insertAfter = new MyNode<>(sc.nextInt());
                    main.list.insertAfter(insertAfter, myNode);
                    System.out.println(main.list);
                    break;
                case DELETE_NODE:
                    System.out.println("Enter element to delete : ");
                    main.list.delete(new MyNode<>(sc.nextInt()));
                    System.out.println("Size after deleting node : " + main.list.size());
                    System.out.println(main.list);
                    break;
                case FIND_INDEX:
                    System.out.println("Enter element : ");
                    System.out.println(main.list.getIndexOf(new MyNode<>(sc.nextInt())));
                    break;
                case IS_EMPTY:
                    System.out.println(main.list.isEmpty() ? "List is empty" : "List is not empty");
                    break;
                case GET_ELEMENT_AT_INDEX:
                    System.out.println("Enter index : ");
                    int index = sc.nextInt();
                    System.out.println(main.list.getElementFromIndex(index).getKey());
                    break;
                case REMOVE_ELEMENT_FROM_INDEX:
                    System.out.println("Enter element : ");
                    System.out.println(main.list.removeFromIndex(sc.nextInt()) == true ? "Removed" : "Not removed");
                    System.out.println(main.list);
                    break;
                case EXIT:
                    return;
            }
        }
    }
}