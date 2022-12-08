package ds_queue;

import ds_linkedlist.MyNode;

import java.util.Scanner;

public class MyQueueMain {
    private static final int ENQUEUE = 1;
    private static final int EXIT = 0;
    MyQueue<Integer> myQueue;

    public static void main(String[] args) {
        MyQueueMain myQueueMain = new MyQueueMain();
        myQueueMain.myQueue = new MyQueue<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice");
            System.out.println("1 : Enqueue \n0 : Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case ENQUEUE:
                    System.out.println("Enter element to enqueue : ");
                    myQueueMain.myQueue.enqueue(new MyNode<>(sc.nextInt()));
                    System.out.println(myQueueMain.myQueue);
                    break;
                case EXIT:
                    return;

            }
        }
    }
}
