
/**
 * Write a description of class Character here.
 *
 * @author (Elena Dworak)
 * @version (2.28.2020)
 */
public class Pets
{
    private int age;
    private String petName; 
    
    // constructor for objects of class constructor
    
    
    public Pets(int age, String name)
    {
        this.age = age;
        petName = name; 
    }
    
    // complete the accessor and mutator for this class 
    public String getPetName()
    {
        return petName; 
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void setPetName(String name)
    {
        petName = name;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public String toString()
    {
        return "Pet name:" + "Age" + age; 
    }
}

