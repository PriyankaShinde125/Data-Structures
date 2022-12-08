package ds_queue;

import ds_linkedlist.MyNode;

import java.util.Scanner;

public class MyQueueMain {
    private static final int ENQUEUE = 1;
    private static final int EXIT = 0;
    private static final int DEQUEUE = 2;
    private static final int IS_EMPTY = 3;
    private static final int SIZE = 4;
    MyQueue<Integer> myQueue;

    public static void main(String[] args) {
        MyQueueMain myQueueMain = new MyQueueMain();
        myQueueMain.myQueue = new MyQueue<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice");
            System.out.println("1 : Enqueue \n2 : Dequeue \n3 : IsEmpty \n4 : Size \n0 : Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case ENQUEUE:
                    System.out.println("Enter element to enqueue : ");
                    myQueueMain.myQueue.enqueue(new MyNode<>(sc.nextInt()));
                    System.out.println(myQueueMain.myQueue);
                    break;
                case DEQUEUE:
                    System.out.println(myQueueMain.myQueue.dequeue());
                    System.out.println(myQueueMain.myQueue);
                    break;
                case IS_EMPTY:
                    System.out.println(myQueueMain.myQueue.isEmpty() ? "Queue is empty " : "Queue is not empty");
                    break;
                case SIZE:
                    System.out.println(myQueueMain.myQueue.size());
                    break;
                case EXIT:
                    return;
            }
        }
    }
}
