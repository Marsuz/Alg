import java.util.*;

public class BitManAndProduct {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            long from = in.nextLong();
            long to = in.nextLong();
            System.out.println(getAndSum(from, to));
        }
    }

    private static long getAndSum(long from, long to) {
        long currPower = 1L;
        long result = 0;
        if (to / from >= 2) {
            return 0;
        }

        while (from > 0) {
            if ( from % 2 == to % 2 && from % 2 == 1) {
                result += currPower;
            } else {
                result = 0;
            }
            currPower *= 2;
            from /= 2;
            to /= 2;
        }
        return result;
    }
}