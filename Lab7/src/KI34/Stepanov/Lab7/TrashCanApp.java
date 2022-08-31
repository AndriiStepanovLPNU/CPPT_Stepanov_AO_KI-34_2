/**
 * lab 7 package
 */
package KI34.Stepanov.Lab7;

/**
 * Trash can Application class implements main method for Trash can
 * class possibilities demonstration
 * @author Andriy Stepanov
 * @version 1.0
 */
public class TrashCanApp
{
    /**
     * @param args param
     */
    public static void main(String[] args) {
        TrashCan <? super Data> trashCan = new TrashCan <Data>();
        trashCan.AddData(new Thing("Computer", 3, 25));
        trashCan.AddData(new Food("Apples" , 1));
        trashCan.AddData(new Food("Oranges" , 6));
        trashCan.AddData(new Thing("Phone" , 4, 4));
        Data res = trashCan.findMax();
        System.out.print("The greatest weight on trash can is: \n");
        res.print();
    }
}




