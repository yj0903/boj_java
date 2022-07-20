// 실버4 - 제로

package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj10773 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int num = Integer.parseInt(bf.readLine());
        for (int i = 0; i < num; i++) {
            int data = Integer.parseInt(bf.readLine());
            if (data == 0) {
                stack.pop();
            } else {
                stack.push(data);
            }
        }

        int sum = 0;
        while(stack.size() != 0) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }

}
