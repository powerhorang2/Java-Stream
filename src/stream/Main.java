package stream;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        BigDecimal value = BigDecimal.valueOf(0.1);

        // 0.01
        BigDecimal returnValue = value.multiply(BigDecimal.valueOf(0.1));
        System.out.println(returnValue);
    }

}
