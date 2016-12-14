package crack.stacks.and.queues;

import java.util.Scanner;

/**
 * Created by mzajda on 09/12/2016.
 */
public class MyStackApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n);
        MyStack<Integer> stack = new MyStack<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            stack.push(a);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(stack.min());
            int a = stack.pop();
            System.out.println(a);
        }

    }
}
