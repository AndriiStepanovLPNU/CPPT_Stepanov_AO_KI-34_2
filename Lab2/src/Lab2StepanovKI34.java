import java.io.*;
import java.util.*;
/**
 * Клас Lab2StepanovKI34 реалізує програму до лабораторної роботи №2
 *
 * @author Andriy Stepanov
 * @version 1.0
 * @since version 1.0
 *
 */
public class Lab2StepanovKI34 {
    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args function parameter
     * @throws FileNotFoundException throw about non-existent file
     *
     */
    public static void main(String[] args) throws FileNotFoundException {
        int length;
        char arr[][];
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("Lab2StepanovKI34.txt");
        PrintWriter fout = new PrintWriter(dataFile);
        System.out.print("Введіть розмір квадратної матриці: ");
        length = in.nextInt();
        in.nextLine();
        arr = new char[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                arr[i][j] = (char) " ".codePointAt(0);
            }
        }
        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine();
        if (filler.length() == 0) {
            System.out.print("\nНе введено символ заповнювач");
            System.exit(0);
        }
        if (filler.length() > 1) {
            System.out.print("\nЗабагато символів заповнювачів");
            System.exit(0);
        }
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                arr[i][j] = (char) filler.codePointAt(0);
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(arr[i][j] + " ");
                fout.print(arr[i][j] + " ");
            }
            System.out.print("\n");
            fout.print("\n");
        }
        fout.flush();
        fout.close();
    }
}