package binarysearchtree;
public class MyBinaryTree<T extends Comparable<T>> {
    MyTreeNode<T> root;

    public MyBinaryTree() {
        this.root = null;
    }

    void add(T key) {
        this.root = this.addRecursively(root, key);
    }

    private MyTreeNode<T> addRecursively(MyTreeNode<T> current, T key) {
        if (current == null)
            return new MyTreeNode<>(key);
        int compareResult = key.compareTo(current.getKey());
        if (compareResult == 0)
            return current;
        if (compareResult > 0)
            current.rightNode = addRecursively(current.getRightNode(), key);
        else
            current.leftNode = addRecursively(current.getLeftNode(), key);

        return current;
    }

    public int getSize() {
        return this.getRecursiveSize(root);
    }

    private int getRecursiveSize(MyTreeNode<T> current) {
        return current == null ? 0 : 1 + this.getRecursiveSize(current.leftNode) + this.getRecursiveSize(current.rightNode);
    }
}
