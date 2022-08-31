/**
 * lab 7 package
 */
package KI34.Stepanov.Lab7;

import java.util.*;

/**
 * Class <code>TrashCan</code> implements Trash can
 * @author Andriy Stepanov
 * @version 1.0
 **/
public class TrashCan <T extends Data>
{
    private ArrayList<T> arr;
    /**
     * Constructor
     */
    public TrashCan() {
        arr = new ArrayList<T>();
    }

    /**
     * Method simulates finding the largest weight
     */
    public T findMax()
    {
        if (!arr.isEmpty())
        {
            T max = arr.get(0);
            for (int i=1; i< arr.size(); i++)
            {
                if ( arr.get(i).compareTo(max) > 0 )
                    max = arr.get(i);
            }
            return max;
        }
        return null;
    }

    /**
     * Method simulates adding data
     */
    public void AddData(T data)
    {
        arr.add(data);
        System.out.print("Element added: ");
        data.print();
    }

    /**
     * Method simulates deleting data
     */
    public void DeleteData(int i)
    {
        arr.remove(i);
    }
}
