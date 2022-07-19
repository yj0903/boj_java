// boj10828 - 스택
package boj;

import java.util.Scanner;
import java.util.Stack;

public class boj10828 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Stack stack = new Stack();
        sc.nextLine(); // Delete enter value

        for (int i = 0; i < num; i++) {
            String[] arr = sc.nextLine().split(" ");
            switch (arr[0]) {
                case "push":
                    stack.add(arr[1]);
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
