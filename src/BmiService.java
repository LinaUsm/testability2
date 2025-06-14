public class BmiService {

    public int calculate(double height, int weight) {
        return (int) (weight / (height * height));
    }
}
