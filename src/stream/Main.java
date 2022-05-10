package stream;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        /*
        compareTo 메서드를 사용하여 서로 비교할 수 있다.
        파라미터로 전달되는 값보다 작은 경우 -1, 큰 경우 1 그리고 같은 경우 0을 반환한다.
         */

        BigDecimal value = BigDecimal.valueOf(10);

        // 0
        System.out.println(value.compareTo(BigDecimal.TEN));

        // 1
        System.out.println(value.compareTo(BigDecimal.ONE));

        // -1
        System.out.println(BigDecimal.ONE.compareTo(value));
    }

}
