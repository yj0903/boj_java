// 실버4 - 균형잡힌세상

package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj4949 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean start = true;

        while (start) {
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                // 전체 종료 조건
                if (i == 0 && c == '.') {
                    start = false;
                    break;
                }

                // 문장 마침표
                if (c == '.') {
                    if (stack.size() == 0) {
                        System.out.println("yes");
                        break;
                    } else {
                        System.out.println("no");
                        break;
                    }
                } else if (c=='[' || c=='(') {
                    stack.push(c);
                } else if (c==']') {
                    // error 처리
                    if (stack.size() == 0) {
                        System.out.println("no");
                        break;
                    }
                    if (stack.peek().equals('[')) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else if (c==')') {
                    // error 처리
                    if (stack.size() == 0) {
                        System.out.println("no");
                        break;
                    }
                    if (stack.peek().equals('(')) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
        }
    }
}
