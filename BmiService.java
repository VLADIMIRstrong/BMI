public class BmiService {
    public int calculate(int m, int h) {
        int bmi = m / h ^ 2;
        return bmi;
    }
}
