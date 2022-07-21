package zbCodingTest.zbCodingTest1;

public class zbTest1 {
    public static int isPrime(int i) {
        for (int j = 2; j<=(int)Math.sqrt(i); j++) {
            if (i % j == 0) {
                System.out.println(i+"is not prime");
                return 0;
            }
        }
        System.out.println(i+" prime");
        return 1;
    }
    public static int solution(int n) {
        int answer = 0;
        if (n <= 1) {
            return 0;
        }

        for (int i = 2; i < n; i++) {
            // 소수 판별
            answer += isPrime(i);
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(13));
    }
}
