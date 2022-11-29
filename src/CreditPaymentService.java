public class CreditPaymentService {
    public int calculate(int creditAmount, int creditTerm) {
        double result;
        int resultInt;
        double bid = 9.99 / 12 / 100; // 9.99% ставка
        double degree = Math.pow((1 + bid), -(creditTerm * 12));
        result = creditAmount * bid / (1 - degree);
        resultInt = (int) result;
        return resultInt;
    }
}

