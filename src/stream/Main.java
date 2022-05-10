package stream;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        BigDecimal value1 = BigDecimal.valueOf(0.12);
        BigDecimal value2 = BigDecimal.valueOf(0.3);

        BigDecimal divideValue = value1.divide(value2);
        System.out.println(divideValue);
    }

}
