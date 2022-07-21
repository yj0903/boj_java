package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class boj10845 {

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        LinkedList<Integer> que = new LinkedList<>();
        int back_data = -999;

        for (int i = 0; i < num; i++) {
            String s = br.readLine();
            String[] arr = s.split(" ");

            // 정수 arr[1]을 큐에 넣는 연산
            if (arr[0].equals("push")) {
                back_data = Integer.parseInt(arr[1]);
                que.add(back_data);
            }
            // 큐 맨앞 정수 빼고, 출력 (없으면 -1 출력)
            else if (arr[0].equals("pop")) {
                if (que.size() == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(que.peek());
                    que.poll();
                }
                // 큐에 들어있는 정수 개수
            }else if (arr[0].equals("size")) {
                System.out.println(que.size());
            }
            // 비어있으면 1, 없으면 0
            else if (arr[0].equals("empty")) {
                if (que.size() == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
            // 큐 맨앞 정수 출력 (없으면 -1)
            else if (arr[0].equals("front")) {
                if (que.size() == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(que.peek());
                }
            }
            // 큐 맨 뒤 정수 출력 (없으면 -1)
            else if (arr[0].equals("back")) {
                if (que.size() == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(back_data);
                }
            }
        }
    }
}
