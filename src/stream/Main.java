package stream;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        BigDecimal value = BigDecimal.valueOf(12.23);

        // 13.23
        BigDecimal returnValue = value.add(BigDecimal.ONE);
        System.out.println(returnValue);
    }

}
