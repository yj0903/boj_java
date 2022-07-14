package zbCodingTest;

public class zbTest4 {
    public static int solution(int n, int i, int j) {
        int answer = 0;
        int cnt = 0;
        int[][] arr = new int[n][n];
        int[][] dir = {{0, 0}, {0, -1}, {1, -1}, {1, 0}};
        while (n != 1) {
            n = n>>1;
            cnt++;
        }
        if (n == 2) {

        }


        for (int k = n-1; k > 0; k = k - n / 2) {

            for (int[] d : dir) {



            }

        }




        return answer;
    }

    public static void main(String[] args) {
        solution(16, 0, 0);
    }
}
