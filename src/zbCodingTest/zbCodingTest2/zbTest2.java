// 정확성:  2/10
// 효율성:  6/10
// 8/20

package zbCodingTest.zbCodingTest2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class zbTest2 {
    public static int[] solution(int[] a, int[] b) {
        int[] answer = {};
        
        // 양쪽 길이 동일한 경우
        if (a.length == b.length) {
            int len = a.length;
            int totalLength = a[0] + b[0] > 9 ? a.length + 1 : a.length;
            int[] c = new int[totalLength];
            int carry = 0;

            for (int i = 0; i < len ; i++) {
                if (a[len-1-i] + b[len-1-i] + carry > 9) {
                    c[totalLength-1-i] = (a[len-1-i] + b[len-1-i] + carry) % 10;
                    carry = 1;
                } else {
                    c[totalLength-1-i] = a[len-1-i] + b[len-1-i] + carry;
                    carry = 0;
                }
            }
            if (len != totalLength) {
                c[0] = carry;
            }
            answer = c;
        }
        // 양쪽 길이 다른 경우. 큐
        else {
            int totalLength = Math.max(a.length, b.length);
            Queue<Integer> que = new LinkedList<>();
            int carry = 0;

            for (int i = 0; i < totalLength; i++) {
                // a가 끝난 경우
                if (a.length -1< i) {
                    que.add((b[b.length - 1 - i] + carry) % 10);
                    System.out.println((b[b.length - 1 - i] + carry) % 10);
                    carry = b[b.length - 1 - i] + carry > 9 ? 1 : 0;
                }
                // b가 끝난 경우
                else if (b.length -1< i) {
                    que.add((a[a.length - 1 - i] + carry) % 10);
                    System.out.println((a[a.length - 1 - i] + carry) % 10);
                    carry = a[a.length - 1 - i] + carry > 9 ? 1 : 0;
                }
                // a,b 둘다 연산할게 남은 경우
                else {
                    que.add((a[a.length - 1 - i] + b[b.length - 1 - i] + carry) % 10);
                    System.out.println((a[a.length - 1 - i] + b[b.length - 1 - i] + carry) % 10);
                    carry = (a[a.length - 1 - i] + b[b.length - 1 - i] + carry) > 9 ? 1 : 0;
                }
            }
            if (carry == 1) {
                que.add(carry);
                System.out.println("** "+carry);
            }

            int[] c = new int[que.size()];
            for (int i = 0; i < que.size(); i++) {
                c[i] = que.poll();
            }
            answer = c;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {9,9,9,9,9};
        int[] b = {1};
        System.out.println(Arrays.toString(solution(a, b)));
    }
}
