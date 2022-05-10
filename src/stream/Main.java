package stream;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        /*
        최댓값은 max, 최솟값은 min 메서드를 사용하면 전달되는 파라미터와 비교하여 구할 수 있다.
         */

        BigDecimal value = BigDecimal.valueOf(10);

        // 10
        System.out.println(value.max(BigDecimal.ONE));

        // 1
        System.out.println(value.min(BigDecimal.ONE));
    }

}
