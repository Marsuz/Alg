package crack.stacks.and.queues;

import java.util.Scanner;

/**
 * Created by mzajda on 09/12/2016.
 */
public class MyQueueApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n);
        MyQueue<Integer> queue = new MyQueue<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            queue.push(a);
        }

        for (int i = 0; i < n; i++) {
            int a = queue.pop();
            System.out.println(a);
        }

    }
}
