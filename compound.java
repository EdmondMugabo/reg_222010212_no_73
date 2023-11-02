import java.text.DecimalFormat;

class Loan {
    private double principal;
    private double monthlyRate;
    private int months;

    public Loan(double principal, double monthlyRate, int months) {
        this.principal = principal;
        this.monthlyRate = monthlyRate;
        this.months = months;
    }

    public double calculateTotalPayment() {
        double totalPayment = principal;
        for (int i = 0; i < months; i++) {
            totalPayment += totalPayment * monthlyRate / 100;
        }
        return totalPayment;
    }
}

public class compound {
    public static void main(String[] args) {
        double principal = 500000.0; // Loan amount in RWK
        double annualRate = 18.0; // Annual interest rate in percentage
        int years = 3; // Number of years

        double monthlyRate = annualRate / 12.0;
        int months = years * 12;

        Loan bobLoan = new Loan(principal, monthlyRate, months);
        double totalPayment = bobLoan.calculateTotalPayment();

        DecimalFormat df = new DecimalFormat("#.##");
        String formattedTotalPayment = df.format(totalPayment);

        System.out.println("Mr. Bob will have paid a total of " + formattedTotalPayment + " RWK after " + years + " years with compound interest.");
    }
}
