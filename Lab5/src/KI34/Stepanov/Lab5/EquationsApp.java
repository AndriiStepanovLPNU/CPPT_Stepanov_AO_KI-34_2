package KI34.Stepanov.Lab5;
import java.util.*;
import java.io.*;

/**
 * Class <code>EquationsApp</code> Implements driver for Equations class
 * @author Andriy Stepanov
 * @version 1.0
 */
public class EquationsApp {
    /**
     * @param args function's parameters
     */
    public static void main(String[] args)
    {
        try
        {
            Scanner in = new Scanner(System.in);
            PrintWriter fout = new PrintWriter(new File("Result"));
            try
            {
                try
                {
                    Equations eq = new Equations();
                    System.out.print("Enter X: ");
                    fout.print(eq.calculate(in.nextInt()));
                }
                finally
                {
                    // Цей блок виконається за будь-яких обставин
                    fout.flush();
                    fout.close();
                }
            }
            catch (CalcException ex)
            {
                // Блок перехоплює помилки обчислень виразу
                System.out.print(ex.getMessage());
            }
        }
        catch (FileNotFoundException ex)
        {
            // Блок перехоплює помилки роботи з файлом навіть якщо вони
            // виникли у блоці finally
            System.out.print("Exception reason: Perhaps wrong file path");
        }
    }
}


