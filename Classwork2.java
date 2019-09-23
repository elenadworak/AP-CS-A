import java.util.Scanner; 

public class Classwork2
{
    public static void main(String[] args)
    { 
        // *Construct a scanner object
           //Scanner mydopescan = new Scanner(System.in);
        // *Give the user a prompt
        //System.out.println("Enter your age:");
        
        //double userInput = mydopescan.nextDouble(); 
        
        //double comparisonData = 36/userInput;
        
        //System.out.println("Ms.Kennedy is " + comparisonData + "times your age"); 
     
        // you example: give the user a prompt\
        
        // create 2-3 examples of your own apps
        
        // example 1 
        Scanner mydopescan = new Scanner(System.in);
        System.out.println("Enter your weight in pounds:"); 
        double userInput = mydopescan.nextDouble(); 
      
        
        double compareData = 135/userInput; 
        System.out.println("Elena weighs" + compareData + "times your weight"); 
       
    }
}
    