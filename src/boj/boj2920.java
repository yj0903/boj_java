package boj;

import java.util.Scanner;

public class boj2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[8];
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < 8; i++) {
            data[i] = sc.nextInt();
        }

        for (int i = 1; i < 8; i++) {
            if (data[i - 1] < data[i]) {
                descending = false;
            }
            if (data[i - 1] > data[i]) {
                ascending = false;
            }
        }
        if (ascending) {
            System.out.println("ascending");
        } else if (descending) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

    }
}
