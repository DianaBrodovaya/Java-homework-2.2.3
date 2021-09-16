public class CreditPaymentService {

    public long calculate(long creditAmount, int creditPeriodInYears, double percentRate) {
        percentRate = percentRate / 12 / 100;
        double coefficient = percentRate * Math.pow(1 + percentRate, creditPeriodInYears * 12) / (Math.pow(1 + percentRate, creditPeriodInYears * 12) - 1);
        double monthlyPayment = creditAmount * coefficient;
        return Math.round(monthlyPayment);
    }
}
