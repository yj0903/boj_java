// boj2164 카드2

package boj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj2164 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i <= num; i++) {
            que.add(i);
        }

        while (que.size() > 1) {
            // 한장 버림
            que.remove(que.peek());
            // 한장은 뒤로 넘김
            int p = que.peek();
            que.remove(p);
            que.add(p);
        }
        System.out.println(que.peek());
    }
}
