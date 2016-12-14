package crack.dynamic;

import java.util.Scanner;

/**
 * Created by mzajda on 14/12/2016.
 */
public class MyBackpackApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int limit = in.nextInt();
        MyBackpack bp = new MyBackpack();
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            int weight = in.nextInt();
            bp.addItem(val, weight);
        }
        System.out.println(bp.getBestItems(limit));
    }
}
