package crack.linkedlists;

import java.util.Scanner;

/**
 * Created by mzajda on 27/11/2016.
 */
public class Ex24 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sizeA = in.nextInt();

    }

    private static class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
        }

        public String toString() {
            if (this.next == null) return Integer.toString(this.val);
            return Integer.toString(this.val) + " -> " + this.next.toString();
        }
    }

    private static Node addToList(Node head, int val) {
        Node newHead = new Node(val);
        newHead.next = head;
        return newHead;
    }
}
