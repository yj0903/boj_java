package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            boolean correct = true;
            Stack<Character> stack = new Stack<>();

            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.size() == 0) {
                        correct = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if (correct && stack.size()==0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
