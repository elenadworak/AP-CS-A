
public class TamStudent
{
    private String name; 
    private double gpa; 
    private String[] classes; 
    
    // no args constructor 
  public TamStudent() 
    {
        name = "Joe Doe"; 
        gpa = 3.37; 
        classes = new String[7]; 
    }
   public TamStudent(String n, double ggpa, String[] c)
    {
        name = n;
        gpa = ggpa; 
        classes = c; 

}
} 
