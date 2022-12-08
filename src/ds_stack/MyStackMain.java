package ds_stack;

import ds_linkedlist.MyNode;

import java.util.Scanner;

public class MyStackMain {
    private static final int PUSH = 1;
    public static final int EXIT = 0;
    MyStack<Integer> myStack;

    public static void main(String[] args) {
        MyStackMain myStackMain = new MyStackMain();
        myStackMain.myStack = new MyStack<>();
        while (true){
            System.out.println("Enter your choice");
            System.out.println("1 : Push \n0 : Exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice){
                case PUSH:
                    System.out.println("Enter element : ");
                    myStackMain.myStack.push(new MyNode<>(sc.nextInt()));
                    System.out.println(myStackMain.myStack);
                    break;
                case EXIT:
                    return;
            }
        }
    }
}
