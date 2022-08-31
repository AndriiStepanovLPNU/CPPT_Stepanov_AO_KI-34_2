/**
 * lab 7 package
 */
package KI34.Stepanov.Lab7;

/**
 * Interface <code>Data</code> extends Comparable
 * @author Andriy Stepanov
 * @version 1.0
 **/
public interface Data extends Comparable<Data>
{
    public int getWeight();
    public void print();
}