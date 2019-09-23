import java.util.Scanner;
public class Classwork3
{
   public static void main(String[] args)
   {
    /** Objective #1: Write an application to accept a side length for a prism,
        * and output the volume of a cube.
        *
        * Precondition: The user enters a number for the side length, and not a special character or letter
          * Postcondition: The program outputs a volume if the user enters a positive number. If the user
        *       does not enter a positive number, the program responds with "Invalid Input"
        */
   
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a side length for your cube:");
    double s = scan.nextDouble();
    
    if (s > 0)
    {
        double volume = Math.pow(s, 3);
        System.out.println("Volume:" + " " + volume);
        System.out.println("    ");
       
    } 
    
    else 
        System.out.println("Invalid entry"); 

    /** Objective #2: Write an application to determine the dumber of solutions to a quadratic equation, 
       * The program accepts a, b, and c from a user, and tells the user how many solutions, if any, exist
       * 
       * Precondition: the user enters numbers, and not special characters or letters
       * Post condition: if there are two solutions, the program outputs "two solutions" if there is one 
       * one solution the program outputs "one solution" and if there are no solutions the program output
       * "no solution 
     */       
    System.out.println("Enter a:");
    double a = scan.nextDouble(); 

    System.out.println("Enter b:");
    double b = scan.nextDouble(); 

    System.out.println("Enter c:");
    double c = scan.nextDouble(); 
    
    double discriminant = b*b - 4*a*c; 
if (discriminant <= 0)
    System.out.println("No real solutions.");
else if (discriminant == 0) 
    System.out.println("One solution.");
else 
    System.out.println("Two soultions."); 

    System.out.println("   "); 
    
    System.out.println("Enter height (inches):");
    double height = scan.nextDouble(); 
    
    System.out.println("Enter age(years):");
    double age = scan.nextDouble(); 
    
    System.out.println("Enter weight:");
    double grade = scan.nextDouble(); 
    
    double elenaHeight= 65.0; 
    double elenaAge= 17.0;
    double elenaWeight= 130.0; 
    
    double heightCompare= height/elenaHeight;
    double ageCompare= age/elenaAge;
    double weightCompare= grade/elenaWeight;
   
    System.out.println("You are " +heightCompare+ " times Elena's height. You are "
        + ageCompare + " times Elena's age. You are " + weightCompare + " times Elena's weight"); 
    
    if (heightCompare <= 1)
    System.out.println("You are short.");
else if (heightCompare == 1) 
    System.out.println("You are Elena's height.");
else 
    System.out.println("You are tall."); 
        
   if (ageCompare <= 1)
    System.out.println("You are young.");
else if (heightCompare == 1) 
    System.out.println("You are Elena's age.");
else 
    System.out.println("You are old."); 
  
   if (weightCompare <= 1)
    System.out.println("You are light.");
else if (heightCompare == 1) 
    System.out.println("You are Elena's weight.");
else 
    System.out.println("You are heavy."); 
    
    }
}



// hw: write two or three program examples 


