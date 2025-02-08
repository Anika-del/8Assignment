import java.util.Scanner;

public class StringLength11 {
	
	
    public static int length(String s) {
        if (s == null) {
            return 0;
        }
        return s.length();
    }

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter string which you want length= ");
	
	
       // String example = "Hello, World!";
	   String example = sc.nextLine();
        System.out.println("The length of the string is: " + length(example));
    }
}
