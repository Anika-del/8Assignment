public class NumberToWord25 {
    // User-defined static method that converts a number into words
    static void numberToWords(char num[]) {
        // Determines the number of digits in the given number
        int len = num.length;

        // Checks if the given number is empty
        if (len == 0) {
            System.out.println("The string is empty.");
            return;
        }

        // Specifies that the number should be four or less than four digits
        if (len > 4) {
            System.out.println("\nThe given number has more than 4 digits.");
            return;
        }

        // String type array for one-digit numbers
        String[] onedigit = {
            "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
        };

        // String type array for two-digit numbers
        String[] twodigits = {
            "", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };

        // String type array of tens multiples
        String[] multipleoftens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
        };

        // String type array of power of tens
        String[] poweroftens = {
            "Hundred", "Thousand"
        };

        // Used for debugging purpose only
        System.out.print(String.valueOf(num) + ": ");

        // Checks whether the length of the given string is one
        if (len == 1) {
            // Prints the value of the corresponding index
            System.out.println(onedigit[num[0] - '0']);
            return;
        }

        int x = 0;
        while (x < num.length) {
            // Executes if the length of the string is greater than or equal to three
            if (len >= 3) {
                if (num[x] - '0' != 0) {
                    System.out.print(onedigit[num[x] - '0'] + " ");
                    System.out.print(poweroftens[len - 3] + " ");
                }
                len--;
            } else {
                // Handles numbers from 10 to 19
                if (num[x] - '0' == 1) {
                    int sum = num[x] - '0' + num[x + 1] - '0';
                    System.out.print(twodigits[sum]);
                    return;
                } else {
                    // Prints tens and ones place words
                    System.out.print(multipleoftens[num[x] - '0'] + " ");
                    x++;
                    if (num[x] - '0' != 0)
                        System.out.print(onedigit[num[x] - '0']);
                }
            }
            x++;
        }
    }

    public static void main(String[] args) {
        char[] num = "54297".toCharArray(); // Replace with your desired number
        numberToWords(num);

        char[] num1 = "5429".toCharArray(); // Replace with your desired number
        numberToWords(num1);
System.out.println();
        char[] num2 = "1234".toCharArray(); // Replace with your desired number
        numberToWords(num2);
    }
}
/*
D:\8Assignment\2ArraysAssignment\Assignment\20TO30>java NumberToWord25

The given number has more than 4 digits.
5429: Five Thousand Four Hundred Twenty Nine
1234: One Thousand Two Hundred Thirty Four
 */