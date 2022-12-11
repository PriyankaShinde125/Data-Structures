package stack;

import linkedlist.MyNode;

import java.util.Scanner;

public class MyStackMain {
    private static final int PUSH = 1;
    public static final int EXIT = 0;
    private static final int POP = 2;
    private static final int PEAK = 3;
    private static final int IS_EMPTY = 4;
    private static final int SIZE = 5;
    MyStack<Integer> myStack;

    public static void main(String[] args) {
        MyStackMain myStackMain = new MyStackMain();
        myStackMain.myStack = new MyStack<>();
        while (true) {
            System.out.println("Enter your choice");
            System.out.println("1 : Push \n" +
                    "2 : Pop \n" +
                    "3 : Peak \n" +
                    "4 : isEmpty \n" +
                    "5 : size \n" +
                    "0 : Exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case PUSH:
                    System.out.println("Enter element : ");
                    myStackMain.myStack.push(new MyNode<>(sc.nextInt()));
                    System.out.println(myStackMain.myStack);
                    break;
                case POP:
                    System.out.println(myStackMain.myStack.pop());
                    System.out.println(myStackMain.myStack);
                    break;
                case PEAK:
                    System.out.println(myStackMain.myStack.peak());
                    System.out.println(myStackMain.myStack);
                    break;
                case IS_EMPTY:
                    System.out.println(myStackMain.myStack.isEmpty() ? "Stack is empty" : " Stack is not empty");
                    break;
                case SIZE:
                    System.out.println("Stack size is : " +myStackMain.myStack.size());
                    break;
                case EXIT:
                    return;
            }
        }
    }
}
