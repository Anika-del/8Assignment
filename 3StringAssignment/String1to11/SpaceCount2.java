
    
    import java.util.StringTokenizer;

    public class SpaceCount2 {
                public static void main(String[] args) {

            String inputString = "a=b c='123 456' d=777 e='uij yyy'";
            StringTokenizer tokenizer = new StringTokenizer(inputString, " ");
            int spaceCount = tokenizer.countTokens() - 1; // Subtract 1 to get the actual space count
            System.out.println("Number of spaces: " + spaceCount);
        }
    }/*
Number of spaces: 5
 */
    
