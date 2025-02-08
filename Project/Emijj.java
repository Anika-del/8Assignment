import java.util.*;

class Emijj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double principal = scanner.nextFloat();

        System.out.print("Enter rate: ");
        double rate = scanner.nextFloat();
        rate = rate / (12 * 100);

        System.out.print("Enter time in years: ");
        double time = scanner.nextFloat();
        time = time * 12;

        double emi = (principal * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1);
        System.out.print("Monthly EMI is= " + emi + "\n");
    }
}
