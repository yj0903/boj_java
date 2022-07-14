package zbCodingTest;

import java.util.HashSet;

public class zbTest2 {
    public static int solution(String[] names) {
        int answer = 0;
        HashSet<String> nameSet = new HashSet<>();
        for (String s : names) {
            nameSet.add(s);
        }
        int cnt = nameSet.size();
        int uResult = 1;
        int dResult = 1;

        // 조합 cnt C 4
        for (int i = 0; i < 4; i++) {
            uResult *= (cnt-i);
            dResult *= (4-i);
        }
        answer = uResult / dResult;

        return answer;

    }

    public static void main(String[] args) {
        String[] names = {"제로", "베이스", "자바", "자바","백엔드"};
        String[] name2 = {"제로", "베이스", "자바", "스쿨","자바","베이스","베이스","백엔드","화이팅"};
        System.out.println(solution(name2));
    }
}
