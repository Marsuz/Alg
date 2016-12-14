package crack.stacks.and.queues;

/**
 * Created by mzajda on 09/12/2016.
 */
public class MyStack<T extends Comparable> {

    private Node top;

    public void push(T toAdd) {
        Node node = new Node(toAdd);
        if (top == null) {
            node.minUnder = toAdd;
        } else {
            if (top.minUnder.compareTo(toAdd) == 1) {
                node.minUnder = toAdd;
            } else {
                node.minUnder = top.minUnder;
            }
        }
        node.next = top;
        top = node;
    }

    public T pop() {
        if (top == null) return null;
        Node result = top;
        top = top.next;
        return result.val;
    }

    public T min() {
        return top.minUnder;
    }

    private class Node {
        T val;
        T minUnder;
        Node next;

        Node(T val) {
            this.val = val;
        }
    }
}
