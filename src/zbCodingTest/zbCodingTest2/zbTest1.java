// 정확성: 10/10
// 효율성:  4/10
// 14/20

package zbCodingTest.zbCodingTest2;

import java.util.ArrayList;
import java.util.Collections;

public class zbTest1 {

    public static int solution(int[] numbers) {
        int answer = -1;
        ArrayList<Integer> list = new ArrayList<>();
        for (int n: numbers) {
            list.add(n);
        }

        Collections.sort(list);
        int prev = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) - prev != 1) {
                return prev + 1;
            }
            prev = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 2, 3, 7, 5};
        System.out.println(solution(arr));;
    }
}
