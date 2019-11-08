
/**
 * Write a description of class oneDarrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class oneDarrays
{
    public static void main(String[] args) 
    { 
      int[] faveNumbers = new int[5]; 
      double[] grades = new double[7]; 
      
      faveNumbers[0] = 7; 
      faveNumbers[1] = 22; 
      faveNumbers[2] = 2002;
      faveNumbers[3] = 10000; 
      
      for (int i = 0; i < faveNumbers.length; i++) 
        System.out.println(faveNumbers[i]); 
        
      for (int i = 0; i< grades.length; i++)
        grades[i] = 92.0 + i; 
      
      for (int i = 0; i < grades.length; i++) 
        System.out.println(grades[i]);
    
      // declare and initialize a 1D array 
      // of string data containing 
      // your five favorite movies 
      
      //String[] faveMovies = new String[5]; 
      // store data 
      // declaring and initializing a 1D array in 1 statement
      String[] faveMovies = {"Spiderman Into The Spiderverse", 
          "Chitty Chitty Bang Bang", "Coraline", "Billy Elliot", 
          "The Immitation Game"};
      for (int i = 0; i < faveMovies.length; i++) 
        System.out.println(faveMovies[i]); 
      
    
    
    
    } 
}
