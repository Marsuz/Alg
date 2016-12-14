package crack.stacks.and.queues;

/**
 * Created by mzajda on 09/12/2016.
 */
public class MyQueue<T> {

    private Node first;
    private Node last;

    public void push(T val) {
        Node node = new Node(val);
        if (first == null) {
            last = node;
            first = last;
        } else {
            last.next = node;
            last = last.next;
        }
    }

    public T pop() {
        if (first == null) return null;
        Node result = first;
        first = first.next;
        return result.val;
    }

    private class Node {
        T val;
        Node next;

        Node(T val) {
            this.val = val;
        }
    }
}
