

public class StringProcessor2
{
    public static String withoutEnds(String str) 
    { 
        return (str.substring(1, str.length()-1));
}
    public static String front2(String str) 
    { 
        return (str.substring(str.length()-2) + str.substring(0, str.length()-2));
}
    public static String firstFour(String str) 
    { 
        if (str.length() >= 4)
            return str.substring(0, 5);
        else if (str.length() == 3)
            return str + "#"; 
        else if (str.length() == 2)
            return str + "##"; 
        else if (str.length() == 1)
            return str + "###"; 
        else 
            return str + "####"; 
}
    public static String frontAgain(String str) 
    { 
        String modStr = str.toLowerCase();
        String first2 = substring.str(0,3);
        String last2 = str.substring(modStr.length(), 
}
}
