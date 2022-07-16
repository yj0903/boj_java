import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

// 브론즈2 - 블랙잭
public class boj2798 {
    public static void main(String[] args) {
        int answer = 0;

        // input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println(arr.toString()); // 배열의 주소값을 스트링으로 출력
        System.out.println(Arrays.toString(arr)); // 배열 값 출력

        // n이 100을 넘지 않으므로, 삼중 반복문 해도 100*100*100 = 1,000,000개 밖에 안됨. 완전탐색 가능.
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    int total = arr[i] + arr[j] + arr[k];
                    //M보다는 작으면서, 가장 큰 수
                    if (total <= m) {
                        answer = Math.max(answer, total);
                    }
                }
            }
        }
        System.out.println("answer: " + answer);
    }
}
