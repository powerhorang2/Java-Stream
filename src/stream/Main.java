package stream;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        BigDecimal value1 = BigDecimal.valueOf(83);
        BigDecimal value2 = BigDecimal.valueOf(3);

        /*
        reminder 메서드로 나눗셈 결과의 나머지도 구할 수 있다.
         */

        BigDecimal remainderValue = value1.remainder(value2);
        System.out.println(remainderValue);
    }

}
