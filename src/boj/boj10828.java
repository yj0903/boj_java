// boj10828 - 스택
package boj;

import java.io.*;
import java.util.Stack;

public class boj10828 {

    public static void main(String[] args) throws IOException {
        // 시간초과 해결하기) 스캐너 대신 버퍼리더, 버퍼라이터 사용
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 버퍼리더
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] arr = br.readLine().split(" ");
            switch (arr[0]) {
                case "push":
                    stack.push(Integer.parseInt(arr[1]));
                    break;
                case "top":
                    if (!stack.empty()) {
                        System.out.println(stack.peek());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.empty() ? 1 : 0);
                    break;
                case "pop":
                    if (stack.empty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;
            }
        }
    }
}
