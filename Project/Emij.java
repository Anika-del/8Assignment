import java.util.*;

class Emij {
    public static void main(String args[]) {
        double principal = 1200; // Principal amount
        double rate = 10; // Annual interest rate (in percentage)
        double time = 1; // Loan tenure in years

        rate = rate / (12 * 100); // Convert annual rate to monthly rate
        time = time * 12; // Convert years to months

        double emi = (principal * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1);
        System.out.print("EMI is= " + emi + "\n");
    }
}
