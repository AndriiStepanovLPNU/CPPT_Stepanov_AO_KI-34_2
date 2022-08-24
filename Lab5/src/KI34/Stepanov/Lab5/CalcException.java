package KI34.Stepanov.Lab5;

/**
 * Class <code>CalcException</code> more precises ArithmeticException
 *
 * @author Andriy Stepanov
 * @version 1.0
 */
public class CalcException extends ArithmeticException {
    public CalcException() {
    }

    public CalcException(String cause) {
        super(cause);
    }
}
