public class CharCount3 {

    public static void main(String[] args) {
        
        String someString = "elephant";
char someChar = 'e';
int count = 0;

for (int i = 0; i < someString.length(); i++) {
    if (someString.charAt(i) == someChar) {
        count++;
    }
}

// Assert that the count is 2
assertEquals(2, count);


    }
    
}
