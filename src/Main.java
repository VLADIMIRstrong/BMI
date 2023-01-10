public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 90.0;
        double h = 1.7;
        double myBmi = service.calculate(m, h);
        System.out.println(myBmi);
    }
}