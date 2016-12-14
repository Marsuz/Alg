package crack.linkedlists;

import java.util.Scanner;

/**
 * Created by mzajda on 27/11/2016.
 */
public class Ex25 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sizeA = in.nextInt();
        int sizeB = in.nextInt();
        Node numA = null;
        Node numB = null;

        for (int i = 0; i < sizeA; i++) {
            numA = addToList(numA, in.nextInt());
        }

        for (int i = 0; i < sizeB; i++) {
            numB = addToList(numB, in.nextInt());
        }

        System.out.println(getSum(numA, numB));
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

    private static Node getSum(Node numA, Node numB) {
        Node result = null;
        int carriage = 0;

        Node itA = numA;
        Node itB = numB;

        while (itA != null && itB != null) {
            int currentSum = itA.val + itB.val + carriage;
            result = addToList(result, (currentSum) % 10);
            carriage = (currentSum) / 10;

            itA = itA.next;
            itB = itB.next;
        }

        Node itRest;

        if (itA == null) {
            if (itB == null && carriage > 0) {
                return addToList(result, carriage);
            }
            itRest = itB;
        } else itRest = itA;

        while (itRest != null) {
            int currentSum = itRest.val + carriage;
            result = addToList(result, currentSum % 10);
            carriage = (currentSum) / 10;
            itRest = itRest.next;
        }

        return result;
    }
}
