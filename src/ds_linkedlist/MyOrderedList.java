package ds_linkedlist;

public class MyOrderedList<T> extends MyLinkedList {
    @Override
    public void add(INode newNode) {
        if (tail == null) {
            setTail(newNode);
        }
        if (head == null) {
            setHead(newNode);
        } else {
            currentNode = getHead();
            if (currentNode.compareTo(newNode) > 0)
                super.add(newNode);
            else {
                while (currentNode != null && currentNode.getNext() != null && currentNode.getNext().compareTo(newNode) < 0) {
                    currentNode = currentNode.getNext();
                }
                insertAfter(currentNode, newNode);
            }
        }
    }
}
