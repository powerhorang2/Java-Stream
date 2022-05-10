package stream;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        BigDecimal value1 = BigDecimal.valueOf(0.13);
        BigDecimal value2 = BigDecimal.valueOf(0.3);

        // 정확하게 나누어 몫이 떨어지지 않는 수의 경우 ArithmeticException 예외를 던진다.
        BigDecimal divideValue = value1.divide(value2);
        System.out.println(divideValue);
    }

}
