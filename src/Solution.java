import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            long n = Long.parseUnsignedLong(in.next());
            if (numOfBits(n - 1) % 2 == 1) {
                System.out.println("Louise");
            } else {
                System.out.println("Richard");
            }
        }

    }
    private static int numOfBits(long val) {
        int result = 0;
        while (val > 0) {
            if ( val % 2 == 1) result++;
            val /= 2L;
        }
        return result;
    }
}