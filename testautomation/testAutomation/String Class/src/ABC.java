
public class ABC {

	public static void main(String[] args)
    {
        String s = "Java is java again java again";
 
        char c = 'a';
 
        int count = s.length() - s.replace("v", "").length();
       s= s.replace("v"," ");
        System.out.println(s);
        System.out.println("Number of occurances of 'v' in "+s+" = "+count);
    }
}
