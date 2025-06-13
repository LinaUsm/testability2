public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.68;
        int weight = 50;
        int imt = (int) service.calculate(height, weight); // должно получиться 17

        System.out.println(imt);
    }

}
