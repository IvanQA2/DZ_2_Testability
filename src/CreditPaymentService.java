public class CreditPaymentService {
    public int calculate(int a, int b) {
        double result;
        int resultInt = 0;
        double bid = 9.99 / 12 / 100; // 9.99% ставка
        if (b == 1) {
            double degree = Math.pow((1 + bid), -12);
            result = a * bid / (1 - degree);
            resultInt = (int) result;
        }
        if (b == 2) {
            double degree = Math.pow((1 + bid), -24);
            result = a * bid / (1 - degree);
            resultInt = (int) result;
        }
        if (b == 3) {
            double degree = Math.pow((1 + bid), -36);
            result = a * bid / (1 - degree);
            resultInt = (int) result;
        }
        return resultInt;
    }
}

