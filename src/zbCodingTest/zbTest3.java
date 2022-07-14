package zbCodingTest;

import jdk.jfr.internal.tool.Main;

public class zbTest3 {
    public static int solution(int N) {
        int answer = 0;
        int X = 0;
        int Y = 0;
        for (int i = N; i >= 0; i=i-2) {
            X = i;
            Y = N - i;
            if (X == 0 || Y == 0) {
                answer += 1;
            } else {
                int uResult = 1;
                int xResult = 1;
                int yResult = 1;

                Y = Y / 2;
                for (int j = 1; j <= X+Y; j++) {
                    uResult *= j;
                }
                for (int j = 1; j <= X; j++) {
                    xResult *= j;
                }
                for (int j = 1; j <= Y; j++) {
                    yResult *= j;
                }
                answer += uResult / (xResult * yResult);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
