public class Main {

    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();

        System.out.println("Ежемесячный платеж составит " + creditPaymentService.calculate(1_000_000, 1, 9.99) + " руб.");

        System.out.println("Ежемесячный платеж составит " + creditPaymentService.calculate(1_000_000, 2, 9.99) + " руб.");

        System.out.println("Ежемесячный платеж составит " + creditPaymentService.calculate(1_000_000, 3, 9.99) + " руб.");
    }
}
