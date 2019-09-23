import java.util.Scanner; 
public class Classwork4 // this is called the class header
{
    public static void main(String[] args) // method header
    { 
        Scanner scan = new Scanner(System.in); // do not capitalize variables!
        // write a program that prompts a user for their name! 
        System.out.println("What's your name");
        
        // store the user's name using scan.nextLine() 
        String userName = scan.nextLine(); 
        
        if (userName.equals("Elena") || userName.equals("Elena"))
            System.out.println("Super awesome name!"); 
        else if (userName.equals("Sam") || userName.equals("Sam"))
            System.out.println("Meh... thats okay.");
        else 
            System.out.println("Damn... good luck living with that.");
            
        System.out.println("What's your age"); 
        int userAge = scan.nextInt();
        if (userAge>= 16 || userAge >= 16)
            System.out.println("You can get a drivers license!"); 
        else if (userAge< 16 || userAge < 16)
            System.out.println("You 'shouldn't' drive, but tht's alright I won't tell the cops.");
        
        if (userAge>= 18 || userAge >= 18)
            System.out.println("You can vote to help fix this country!"); 
        else if (userAge <18 || userAge < 18)
            System.out.println("You could go protest...sorry you can't vote buddy.");
        
            if (userAge>= 21 || userAge >= 21)
            System.out.println("You can LEGALLY drink"); 
        else if (userAge < 21 || userAge < 21)
            System.out.println("You 'can't'drink, but does that really stop you? ");
        
        
    }
}
