public class BmiService {
    public double calculate(double weightKg, double heightMeters) {
        double result = weightKg / (heightMeters * heightMeters);
        return (int) result;

    }
}


