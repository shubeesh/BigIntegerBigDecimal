import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {

        BigInteger number1 = new BigInteger("23049872304982730498237402938740239874");
        BigInteger number2 = new BigInteger("45464747474747474747474747474747474747");
        BigInteger number3 = number1.gcd(number2);
        System.out.println(number3);

        BigDecimal decimal = new BigDecimal("66778875783847789380209217272737373737");
        BigDecimal decimal2 = new BigDecimal("372983785839184835739187598759479377487");
        BigDecimal decimalsquared = decimal.pow(2);
        BigDecimal decimal2squared = decimal.pow(2);
    }

}