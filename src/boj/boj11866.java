// 요세푸스 문제 O

package boj;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj11866 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int jump = sc.nextInt();

        Queue<Integer> que = new LinkedList<>();

        for (int i = 1; i <= num; i++) {
            que.add(i);
        }

        System.out.print('<');
        while (que.size() > 1) {

            for (int i = 1; i < jump; i++) {
                que.add(que.peek());
                que.remove(que.peek());
            }

            System.out.print(que.poll()+", ");
        }
        System.out.print(que.poll()+">");
    }

}
