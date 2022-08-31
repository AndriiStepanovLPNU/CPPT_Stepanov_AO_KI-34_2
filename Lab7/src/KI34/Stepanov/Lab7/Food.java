/**
 * lab 7 package
 */
package KI34.Stepanov.Lab7;

/**
 * Class <code>Food</code> implements Data
 * @author Andriy Stepanov
 * @version 1.0
 **/
public class Food implements Data
{
    private String foodName;
    private int weight;

    /**
     * Constructor
     * @param fName Name of Food
     * @param fWeight Food`s weight
     */
    public Food(String fName, int fWeight)
    {
        foodName = fName;
        weight = fWeight;
    }
    /**
     * Method returns food`s name
     * @return Food`s name
     */
    public String getName()
    {
        return foodName;
    }
    /**
     * Method sets the new food`s name
     * @param name Food`s name
     */
    public void SetName(String name)
    {
        foodName = name;
    }

    /**
     * Method sets the new food`s weight
     * @param n food`s weight
     */
    public void SetWeight(int n)
    {
        weight = n;
    }
    /**
     * Method returns food`s weight
     * @return food`s weight
     */
    public int getWeight()
    {
        return weight;
    }
    /**
     * Method simulates comparing food`s weight
     */
    public int compareTo(Data p)
    {
        Integer s = weight;
        return s.compareTo(p.getWeight());
    }
    /**
     * Method simulates printing info about food
     */
    public void print()
    {
        System.out.print("Eat: " + foodName + ", Eat Weight: " + weight + ";\n");
    }
}
