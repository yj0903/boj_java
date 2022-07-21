package zbCodingTest.zbCodingTest1;

public class zbTest5 {
    public static long solution(int N, int M, int K, int[] capacity) {
        long answer = 1;

        // 학생 배치
        for (int i = 0; i < M; i++) {
            int uResult = 1;
            int dResult = 1;

            for (int j = 0; j < M; j++) {
                uResult *= (N - j);
            }

            for (int j = 0; j < capacity[i]; j++) {
                dResult *= (capacity[i] - j);
            }
            N -= capacity[i];
            answer *= (uResult / dResult);
        }

        // 감독관
        int result = 1;
        for (int i = K; i >= K - M + 1; i--) {
            result *= i;
        }
        answer *= result;
        return answer;
    }


    public static void main(String[] args) {
        int[] cap = {5, 3, 4};
        long a = solution(10, 3, 4, cap);
        System.out.println(a);
    }
}
