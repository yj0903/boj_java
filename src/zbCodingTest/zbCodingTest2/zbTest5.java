// 정확성:  10/10
// 효율성:   8/10
// 18/20

package zbCodingTest.zbCodingTest2;

public class zbTest5 {

    public static int[][] solution(int[][] image, int K) {
        int h = image.length;
        int w = image[0].length;
        int p = (K-1)/2;

        int[][] answer = new int[h][w];


        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int sum = 0;

                for (int k = -p; k <= p; k++) {
                    for (int l = -p; l <= p; l++) {

                        if ((i + k < 0) || (j + l < 0) || (i + k >= h) || (j + l >= w)) {
                            sum += 0;
                        } else {
                            sum += image[i + k][j + l];
                        }

                    }
                }
                answer[i][j] = sum / (K * K);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] image = {
                {4, 5, 2, 6, 7},
                {5, 4, 2, 4, 6},
                {6, 8, 4, 8, 7},
                {7, 3, 6, 6, 4},
                {5, 0, 4, 1, 5}};
        int k = 3;
        System.out.println(solution(image,k));
    }
}
