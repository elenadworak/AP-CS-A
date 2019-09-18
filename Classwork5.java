import java.util.Scanner; 

/**
 * elena dworak
 * september 18
 */
public class Classwork5
{
    public static void main (String[] args)
    {
        // exercise 1
       for (int i = 0; i < 5; i+= 1)
        {
         double randNum = (int) (Math.random() * 6) + 1; 
         
         System.out.println("you just rolled a " + randNum);
       }
       System.out.println("   "); 
       //exercise 2
       for (int i = 0; i < 5; i+= 1)
       {
       double randNum1 = (int) (Math.random() * 6) + 1; 
       double randNum2 = (int) (Math.random() * 6) + 1; 
       double rollSum = randNum1 + randNum2;
         // System.out.println("Your first die was a " + randNum1 + ", your second die was a " + randNum2);
         System.out.println("The sum of your dice was " + rollSum);
         if (rollSum == 7 || rollSum == 11)
            System.out.println("Congrats! You got a winning combination!");
         else if (rollSum == 2 || rollSum == 3 || rollSum == 12)
            System.out.println("That sucks! You lose. Better luck next time.");
         else 
            System.out.println("Roll again!");
        }
        System.out.println("   "); 
        //exercise 3
        boolean done = false; 
        while (!done)
        {
        System.out.println("Magic 8 ball"); 
        System.out.println("Ask me a question:");
        Scanner scan = new Scanner(System.in);
        String name =scan.nextLine(); 
        
            double num = (int) (Math.random() * 7) + 1; 
            if (num == 1) 
                System.out.println( "You may never know."); 
            if (num == 2) 
                System.out.println( "Hell yes.");
            if (num == 3) 
                System.out.println( "Don't quit your day job."); 
            if (num == 4) 
                System.out.println( "When pigs fly."); 
            if (num == 5) 
                System.out.println( "That's a no from me."); 
            if (num == 6) 
                System.out.println( "Hmmm......"); 
            if (num == 7) 
                System.out.println( "Yes. I say yes."); 
            if (num == 1) 
                System.out.println( "Why do you trust me?"); 
                
       
        }
    
    }
}
