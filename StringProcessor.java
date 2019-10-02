

public class StringProcessor
{
    public static void main(String[] args)
    {
     findFirst("Elena");
     
    }
    
    public static void findFirst(String str)
    {
     // prints a to b-1
     System.out.println(str.substring(0,4));
     // prints from a to end 
     System.out.println(str.substring(3));
     // states how many letters are in the strings
     System.out.println(str.length());
     // prints last letter
     System.out.println(str.substring(str.length()-1));
    }
}
