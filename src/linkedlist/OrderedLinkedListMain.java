package linkedlist;

import java.util.Scanner;

public class OrderedLinkedListMain {
    private static final int ADD = 1;
    public static final int EXIT = 0;
    MyLinkedList<Integer> list;

    public static void main(String[] args) {
        OrderedLinkedListMain main = new OrderedLinkedListMain();
        main.list = new MyOrderedList<>();
        while (true) {
            System.out.println("Enter your choice : \n1 : Add  \n0 : Exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case ADD:
                    System.out.println("Enter element to add ");
                    main.list.add(new MyNode<>(sc.nextInt()));
                    System.out.println(main.list);
                    break;
                case EXIT:
                    return;
            }
        }
    }
}
