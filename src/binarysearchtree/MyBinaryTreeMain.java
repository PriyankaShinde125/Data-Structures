package binarysearchtree;

public class MyBinaryTreeMain {
    public static void main(String[] args) {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(10);
        myBinaryTree.add(50);
        myBinaryTree.add(20);
        myBinaryTree.add(30);
        System.out.println("Size = " + myBinaryTree.getSize());
    }
}
