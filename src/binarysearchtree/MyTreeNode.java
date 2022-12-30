package binarysearchtree;

public class MyTreeNode<T extends Comparable<T>> {
    T key;
    MyTreeNode<T> leftNode;
    MyTreeNode<T> rightNode;

    public MyTreeNode(T key) {
        this.key = key;
        this.leftNode = null;
        this.rightNode = null;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public MyTreeNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(MyTreeNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public MyTreeNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(MyTreeNode<T> rightNode) {
        this.rightNode = rightNode;
    }
}
