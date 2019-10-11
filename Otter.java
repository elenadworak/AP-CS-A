

public class Otter
{
    // instance variables are the adjectives to describe your object
    private String firstName; 
    private int numUrchins;
    private double howCute; 
    private boolean hasBaby; 
    
    // constructor definition 
    public Otter(String name, int urchins, double cute, boolean baby) 
    {
        firstName = name; 
        numUrchins = urchins; 
        howCute = cute; 
        hasBaby = baby; 
    } 
    
    // mutator method for changing private data
    public void setName(String n) 
    {
        firstName = n; 
    }
    // accessor method to accessing private data 
    public String getName()
    {
        return firstName; 
    }
    
    public void setUrchins(int u) 
    {
        numUrchins = u; 
    }
    
    public int getUrchins()
    {
        return numUrchins;
    }
    
    public void setCute(double c) 
    {
        howCute = c; 
    }
    
    public double getCute()
    {
        return howCute; 
    } 
    
    public void setBaby(boolean b) 
    {
        hasBaby = b; 
    }
     
    public boolean getBaby()
    {
        return hasBaby; 
    } 
}