public class BmiService {
    public double calculate(double weight, double growth) {
        double mass = weight / (growth * growth);
        return mass;
    }
}
