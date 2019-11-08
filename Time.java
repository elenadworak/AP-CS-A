

public class Time
{
    /* instance variables are adjectives that 
     * describe your object. these are always private
     */
    private int hours; 
    private int mins; 
    private int seconds; 
    public static String TIME_ZONE = "PCT"; 
    
  
    /** 
     * No- args constructor for Time class
     */
    public Time()
    {
        hours = 8;
        //mins = 0;
        //seconds = 0
    }
    
    /** 
     * constructor will take three parameter variables
     * @param hrs the hours on the clock 
     * @param m the minutes
     * @param s the seconds
     */
    public Time(int hrs, int m, int s)
    {
        hours = hrs; 
        mins = m; 
        seconds = s; 
    }
    
    /** 
     * mutator method to change the hours
     * @param the hours we are changing 
     */
    public void setHours(int hrs) 
    {
        hours = hrs; 
    }
    
    /** 
     * Define a mutator method for changing minutes
     * @param the minutes we are changing 
     */
    public void setMinutes(int m) 
    {
        mins = m; 
    }
    
    /** 
     * Define a mutator method for changing seconds
     * @param the seconds we are changing 
     */
    public void setSeconds(int s) 
    {
        seconds = s; 
    }
    
    /**
     * accessor method to geth the hours 
     * @return the hours on the clock
     */
    public int getHours() 
    { 
        return hours; 
    } 
    
    /** 
     * accessor method to get the minutes 
     * @ return the minutes on the clock
     */
    public int getMinutes() 
    {
        return mins; 
    }
    
    /** 
     * accessor method to get the seconds 
     * @ return the seconds on the clock
     */
    public int getSeconds() 
    {
        return seconds; 
    }
    
    public String toString() 
    {
        String objectData = hours + ":" + mins + ":" + seconds; 
        return objectData;
    }
    
    public boolean equals(Time t)
    {
        if (hours == t.getHours() && mins == t.getMinutes() && seconds == t.getSeconds())
            return true; 
        else 
            return false; 
    } 
        
        
}

