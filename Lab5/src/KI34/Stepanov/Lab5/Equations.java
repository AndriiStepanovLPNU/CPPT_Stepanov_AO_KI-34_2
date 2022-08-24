package KI34.Stepanov.Lab5;

/**
 * Class <code>Equations</code> implements method for sin(3x-5)/ctg(2x) expression
 * calculation
 *
 * @author Andriy Stepanov
 * @version 1.0
 */
public class Equations {
    /**
     * Method calculates the sin(3x-5)/ctg(2x) expression
     *
     * @param x Angle in degrees
     * @throws CalcException
     */
    public double calculate(int x) throws CalcException {
        double y, radSin, radCtg;
        radSin = (3 * x - 5) * Math.PI / 180.0;
        radCtg = 2 * x * Math.PI / 180.0;
        try {
            y = Math.sin(radSin) / (1.0 / Math.tan(radCtg));

            // Якщо результат не є числом, то генеруємо виключення
            if (y == Double.NaN || y == Double.NEGATIVE_INFINITY ||
                    y == Double.POSITIVE_INFINITY || x % 90 == 0 || x == 45 || (2 * x) % 270.0 == 0)
                throw new ArithmeticException();
        } catch (ArithmeticException ex) {
            // створимо виключення вищого рівня з поясненням причини
            // виникнення помилки
            if (radCtg % Math.PI / 2.0 == 0)
                throw new CalcException("Exception reason: Illegal value of X for cotangent calculation");
            else if (x == 45 || (2 * x) % 270.0 == 0)
                throw new CalcException("Exception reason: X = 0");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }

        return y;
    }
}
