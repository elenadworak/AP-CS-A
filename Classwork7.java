import java.util.Scanner;

public class Classwork7
{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       System.out.println("How old are you?");
       int age = scan.nextInt();
       System.out.println("Are you telling me the truth? What's your real age?");
       age = scan.nextInt();
       System.out.println(canIVote(age));
       System.out.println(canIDrink(age));
       System.out.println(canIDrive(age));
       
       System.out.println("How many races did you swim?");
       int races = scan.nextInt();
       System.out.println("How many best times did you get?");
       int bestTimes = scan.nextInt();
       System.out.println("You got " + bestTimes/races + "% best times!");
    }
    public static double findSum(int a, int b)
    {
        return a + b;
    }
    public static String canIVote(int age)
    {
        if (age >= 18)
            return "You can vote!";
        else 
            return "You can't vote!";
    }
    public static String canIDrink(int age)
    {
        if (age >= 21)
            return "You can drink!";
        else 
            return "You can't drink!";
    }
    public static String canIDrive(int age)
    {
        if (age >= 16)
            return "You can drive!";
        else 
            return "You can't drive!";
    }
}
