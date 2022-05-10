package stream;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {

        BigDecimal value1 = BigDecimal.valueOf(0.13);
        BigDecimal value2 = BigDecimal.valueOf(0.3);

        /*
        아무리 BigDecimal 클래스라도 나누어떨어지지 않는 수는 정확하게 표현할 수 없다.
        따라서 divide 메서드를 사용할 때는 소수점 몇 번째짜리까지, 어떻게 처리할 것인지 지정을 해줘야 한다.
        예제에서 2번째 파라미터는 N 번째 자리까지 표현할 것인가를 뜻하고, 3번째 파라미터는 처리 방식이다.
        즉, 아래 예제의 경우 소수점 3번째 자리에서 반올림하여 2번째 자리까지 표기한다.
         */

        BigDecimal divideValue = value1.divide(value2, 2, RoundingMode.HALF_UP);
        System.out.println(divideValue);
    }

}
