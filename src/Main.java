// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service =  new BmiService();
        int weightKg = 98;
        double heightMeters = 1.87;
        double res = service.calculate(weightKg, heightMeters);
        int index = (int)res;
        System.out.println(index);
        }
    }

