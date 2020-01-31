import java.util.*; 
public class classwork2_2
{
    public static void main (String[] args) 
    {
        ArrayList<String> sports = new ArrayList<String>(); 
        sports.add("Softball"); 
        sports.add("Soccer"); 
        sports.add("Basketball"); 
        sports.add("Tennis"); 
        sports.add("Skiing"); 
        sports.add("Rowing"); 
        
        System.out.println(returnElement(sports, 3)); 
    }
    // number 1 
    public static void printElements (ArrayList<String> inList)
    {
        for (int i = 0; i< inList.size(); i++)
            System.out.println(inList.get(i)); 
    }
    // number 2 
    public static void insertElement (ArrayList<String> inList, String a) 
    {
        inList.add(0,a); 
    }
    // number 3 
    public static String returnElement(ArrayList<String> inList, int i) 
    {
        return inList.get(i); 
    }
    // number 4 
    public static void removeThirdElement(ArrayList<String> inList) 
    {
        inList.remove(2); 
        for (int i = 0; i <inList.size(); i++)
            System.out.println(inList.get(i)); 
    }
    // number 5 
    public static int searchForElement(ArrayList<String> inList, String a)
    {
        return inList.indexOf(a);
    }
    // number 6 
    public static int searchAndCountElement(ArrayList<String> inList, String a)
    {
        int count = 0; 
        for (int i = 0; i <inList.size(); i++) 
        {
            if(inList.get(i).equals(a)) 
                count +=1;
        }
        return count; 
    }
    // number 7 
    public static ArrayList<String> copyAndReturnList(ArrayList<String> inList) 
    {
        ArrayList<String> copy = new ArrayList<String>(); 
        for (int i = 0; i <inList.size(); i++) 
            copy.add(inList.get(i));
        return copy; 
   
    }
}
