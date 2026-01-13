package S1_Basics.S5Maths;

import java.util.ArrayList;

public class P4_PrintAllDivisor {
    public static void main(String[] args) {

        int[] res = divisors(8);

        for (int i : res) {
            System.out.print(i + " ");
        }

    }

    public static int[] divisors(int n) {
        ArrayList<Integer> li = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                li.add(i);
            }
        }

        int[] res = new int[li.size()];

        for (int i = 0; i < li.size(); i++) {
            res[i] = li.get(i);
        }

        return res;
    }

}