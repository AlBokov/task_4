public class BmiService {
    public int calculate(double weightKg, double heightMeters) {
        double result = weightKg / (heightMeters * heightMeters);
        return (int) result;

    }
}


