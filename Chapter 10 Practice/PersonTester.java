

/**
 * Write a description of class PersonTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonTester
{
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static Person firstPerson(Person[] people)
    {
        Person first = people[0];
        for (int i = 1; i < people.length; i++)
        {
            if(people[i].compareTo(first) < 0)
            {
                first = people[i];
            }
        }
        return first;
    }
    public static void main(String [] args)
    {
        
    }
}
