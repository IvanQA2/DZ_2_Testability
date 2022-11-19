public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Сумма кредита 1000_000, срок кредита 1 год, процентная ставка 9.99%");
        System.out.println(service.calculate(1000_000, 1));

        System.out.println("Сумма кредита 1000_000, срок кредита 2 года, процентная ставка 9.99%");
        System.out.println(service.calculate(1000_000, 2));

        System.out.println("Сумма кредита 1000_000, срок кредита 3 года, процентная ставка 9.99%");
        System.out.println(service.calculate(1000_000, 3));

    }
}