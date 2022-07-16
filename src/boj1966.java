// 실버3 - 프린터 큐

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class boj1966 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 총 문서 수
        int[] answer = new int[num];

        for (int k = 0; k < num; k++) {

            // 1. 입력값
            int n = sc.nextInt(); // 총 문서 수
            int m = sc.nextInt(); // 타겟 인덱스
            int[] priority = new int [n];
            ArrayList<Integer> list = new ArrayList();
            int cnt = 0;
            int cur = 0;

            for (int i = 0; i < n; i++) {
                priority[i] = sc.nextInt();
            }

            // 2. 오른쪽으로 이동(끝에 도착하면 맨 왼쪽으로 옮김)하면서 큐 구현
            while (true) {
                if (Arrays.stream(priority).max().getAsInt() == priority[cur]) {
                    if (cur == m) {
                        answer[k]++;
                        break;
                    }
                    priority[cur] = -1;
                    answer[k]++;
                }
                cur = (cur+1 >= n) ? 0 : cur + 1;
            }
        }
        for (int n : answer) {
            System.out.println(n);
        }
    }
}
