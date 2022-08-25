/**
 * lab 6 package
 */
package KI34.Stepanov.Lab6;

import java.io.*;
import java.util.*;

/**
 * Class <code>FioApp</code> Implements driver for CalcWFio class
 * @author Andriy Stepanov
 * @version 1.0
 */

public class FioApp {
    /**
     * @param args function's parameters
     */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        try {
            CalcWFio obj = new CalcWFio();
            Scanner s = new Scanner(System.in);
            System.out.print("Enter data: ");
            int data = s.nextInt();
            obj.calculate(data);
            System.out.println("Result is: " + obj.getResult());

            obj.writeResTxt("textRes.txt");
            obj.writeResBin("BinRes.bin");

            obj.readResBin("BinRes.bin");
            System.out.println("Result is: " + obj.getResult());
            obj.readResTxt("textRes.txt");
            System.out.println("Result is: " + obj.getResult());
        } catch (CalcException ex) {
            // Блок перехоплює помилки обчислень виразу
            System.out.print(ex.getMessage());
        }
    }
}
