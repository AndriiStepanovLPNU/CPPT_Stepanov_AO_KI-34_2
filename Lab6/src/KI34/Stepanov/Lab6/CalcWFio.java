/**
 * lab 6 package
 */
package KI34.Stepanov.Lab6;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

/**
 * Class <code>CalcWFio</code> implements method for sin(3x-5)/ctg(2x) expression calculation and methods for writing and reading files
 *
 * @author Andriy Stepanov
 * @version 1.0
 */
public class CalcWFio {
    private double result;

    /**
     * Method writes txt file
     *
     * @param fName File's name
     * @throws FileNotFoundException error
     */
    public void writeResTxt(String fName) throws FileNotFoundException {
        PrintWriter f = new PrintWriter(fName);
        f.printf("%f", result);
        f.close();
    }

    /**
     * Method read txt file
     *
     * @param fName File's name
     */
    public void readResTxt(String fName) {
        try {
            File f = new File(fName);
            if (f.exists()) {
                Scanner s = new Scanner(f);
                s.useLocale(Locale.getDefault());
                result = s.nextDouble();
                s.close();
            } else {
                throw new FileNotFoundException("File " + fName + "not found");
            }
        } catch (FileNotFoundException ex) {
            System.out.print(ex.getMessage());
        }
    }

    /**
     * Method writes bin file
     *
     * @param fName File's name
     * @throws IOException error
     */
    public void writeResBin(String fName) throws IOException {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(result);
        f.close();
    }

    /**
     * Method reads bin file
     *
     * @param fName File's name
     * @throws IOException error
     */
    public void readResBin(String fName) throws IOException {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }

    /**
     * Method calculates the sin(3x-5)/ctg(2x) expression
     *
     * @param x Angle in degrees
     * @throws CalcException
     */
    public void calculate(int x) throws CalcException {
        double radSin, radCtg;
        radSin = (3 * x - 5) * Math.PI / 180.0;
        radCtg = 2 * x * Math.PI / 180.0;
        try {
            result = Math.sin(radSin) / (1.0 / Math.tan(radCtg));

            // Якщо результат не є числом, то генеруємо виключення
            if (result == Double.NaN || result == Double.NEGATIVE_INFINITY ||
                    result == Double.POSITIVE_INFINITY || x % 90 == 0 || x == 45 || (2 * x) % 270.0 == 0)
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

    }

    /**
     * Method get the result of the expression
     */
    public double getResult() {
        return result;
    }
}
