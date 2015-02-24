import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person implements Comparable<Person>
{
    private String name;
    public Person(String name)
    {
        this.name = name;
    }
    public int compareTo(Person otherPerson)
    {
        return this.name.compareTo(otherPerson.name);
        
    }

}
