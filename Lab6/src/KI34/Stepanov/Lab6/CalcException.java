/**
 * lab 6 package
 */
package KI34.Stepanov.Lab6;

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