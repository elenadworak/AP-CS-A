

public class TwoDArrays
{
    public static void main(String[] args)
    {
        int[][] temps = new int [5][3];
        temps[0][0] = 97; 
        temps[0][1] = 99; 
        temps[0][2] = 91;
        temps[1][0] = 90;
        temps[1][1] = 99;
        temps[1][2] = 70;
        temps[2][0] = 60;
        temps[2][1] = 39;
        temps[2][2] = 22;
        temps[3][0] = 56;
        temps[3][1] = 88;
        temps[3][2] = 76;
        temps[4][0] = 21;
        temps[4][1] = 113;
        temps[4][2] = 16;
        
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j <3; j++)
                System.out.print(temps[i][j] + " "); 
            System.out.println(); 
         
                
                
    }
    
    String[] names = {"elena", "elli", "ed"};
    String[] ages = {"14", "17", "20"}; 
    String[][] studentInfo = {names, ages}; 
    
    for (int i =0; i <2; i++)
       { 
           for (int j = 0; j< 3; j++)
                System.out.print(studentInfo[i][j] + " ");
           System.out.println(); 
   }
    
   double[][] averages = {{2.2, 3.3, 4.4}, {1, 2, 3}};
   
   for (int i = 0; i < averages.length; i++) 
  {
        for (int j = 0; j < averages[i].length; j++) 
            System.out.print(averages[i][j] + " "); 
           System.out.println(); 
           
  }
}
}
