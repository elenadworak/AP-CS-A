
import java.util.*; 
public class DeletionsEasy
{
    ArrayList<Integer> numbers = new ArrayList<>();
    
    public DeletionsEasy(ArrayList<Integer> a)
    {
        numbers = a; 
    }
    
    public int delete() 
    {
        int count = 0; 
        for (int j = 0; j < numbers.size(); j++)
        {
            count ++; 
            int index = 0; 
            for (int i = 0; i < matrix.length(); i ++)
            {
                if (numbers.get(i) == 0)
                    index = i; 
            }
            
            for (int i = index; i>=0; i--)
            numbers.remove(i);
            
            int max = 0; 
            int loc = 0; 
            for (int i = 0; i <numbers.size(); i++) 
            {
                if (numbers.get(i)>max)
                {max = numbers.get(i);
                    loc = i}
            }
            
            if (max%2 == 0 && numbers.size() > 0)
                numbers.set(loc, max - 2); 
            else if (max%2! = 0)
                numbers.set(loc, max -1);
            }
            return count;
        }
    }
    
   
}
