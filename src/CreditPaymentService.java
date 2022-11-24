public class CreditPaymentService {
    public int calculate(int creditAmount, int creditTerm) {
        double result;
        int resultInt = 0;
        double bid = 9.99 / 12 / 100; // 9.99% ставка
        if (creditTerm == 1) {
            double degree = Math.pow((1 + bid), -12);
            result = creditAmount * bid / (1 - degree);
            resultInt = (int) result;
        }
        if (creditTerm == 2) {
            double degree = Math.pow((1 + bid), -24);
            result = creditAmount * bid / (1 - degree);
            resultInt = (int) result;
        }
        if (creditTerm == 3) {
            double degree = Math.pow((1 + bid), -36);
            result = creditAmount * bid / (1 - degree);
            resultInt = (int) result;
        }
        return resultInt;
    }
}

