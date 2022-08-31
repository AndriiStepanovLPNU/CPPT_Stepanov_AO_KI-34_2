/**
 * lab 7 package
 */
package KI34.Stepanov.Lab7;

/**
 * Class <code>Thing</code> implements Data
 * @author Andriy Stepanov
 * @version 1.0
 **/
public class Thing implements Data
{
    private String thingName;
    private int usedYears;
    private int weight;

    /**
     * Constructor
     * @param tName Name of thing
     * @param tUsed Thing`s years usage
     * @param tWeight Thing`s weight
     */
    public Thing(String tName, int tUsed, int tWeight)
    {
        thingName = tName;
        usedYears = tUsed;
        weight = tWeight;
    }

    /**
     * Method returns thing`s name
     * @return thing`s name
     */
    public String getThingName()
    {
        return thingName;
    }
    /**
     * Method sets the new thing`s name
     * @param name thing`s name
     */
    public void setThingName(String name)
    {
        thingName = name;
    }
    /**
     * Method returns thing`s years usage
     * @return entertainment thing`s size
     */
    public int getUsedYears()
    {
        return usedYears;
    }
    /**
     * Method sets the new thing`s years usage
     * @param n thing`s years usage
     */
    public void setUsedYears(int n)
    {
        usedYears = n;
    }
    /**
     * Method returns thing`s weight
     * @return thing`s weight
     */
    public int getWeight()
    {
        return weight;
    }
    /**
     * Method simulates comparing thing`s weight
     */
    public int compareTo(Data p)
    {
        Integer s = weight;
        return s.compareTo(p.getWeight());
    }

    /**
     * Method simulates printing info about thing
     */
    public void print()
    {
        System.out.print("Thing: " + thingName + ", Years used: " + usedYears +
                ", Thing Weight: " + weight + ";\n");
    }
}