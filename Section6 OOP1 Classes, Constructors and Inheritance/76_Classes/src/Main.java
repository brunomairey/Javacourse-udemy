public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is" + porsche.getModel());
    }
}
