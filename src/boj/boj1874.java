package boj;// 실버2 - 스택 수열

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class boj1874 {

    public static void main(String[] args) {

        // 1. 입력값 받아오기
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack();
        ArrayList<Character> answer = new ArrayList();
        int n = sc.nextInt();
        int cnt = 1; // start 1 ~ max n

        for (int i = 0; i < n; i++) {
            int in = sc.nextInt();

            // 스택에 푸시하는 경우
            while (cnt <= in) {
                stack.push(cnt);
                cnt++;
                answer.add('+');
            }

            // 스택에서 팝하는 경우
            if (stack.peek() == in) {
                stack.pop();
                answer.add('-');
            } else {
                System.out.println("NO");
                return;
            }
        }

        for (int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i)); // i index에 해당하는 값 출력
        }
    }
}
