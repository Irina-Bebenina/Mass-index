public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = service.calculate(85, 1.64);
        System.out.println(mass);
    }
}
