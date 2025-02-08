public class BinaryToecimal23 {

    public static void StringBinaryToDecimal(String s) {
        int ans = 0, p = 0;
        int len = s.length();
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                ans += Math.pow(2, p);
            }
            p++;
        }
        System.out.println("Decimal Equivalent of " + s + " is " + ans);
    }

    public static void IntegerBinaryToDecimal(int num) {
        int ans = 0, rem, temp = num, i = 0;
        while (num != 0) {
            rem = num % 10;
            num /= 10;
            ans += rem * Math.pow(2, i);
            i++;
        }
        System.out.println("Decimal Equivalent of " + temp + " is " + ans);
    }

    public static void main(String[] args) {
        int num = 1010;
        String s = "1100";
        IntegerBinaryToDecimal(num);
        StringBinaryToDecimal(s);
    }
}