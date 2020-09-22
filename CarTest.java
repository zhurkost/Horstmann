public class CarTest {
    public static void main(String[] args) {
        Car bmw = new Car(70,3);
        bmw.fill(70);
        bmw.drive(50);
        bmw.status();
        bmw.fill(-10);
        bmw.fill(110);
        bmw.drive(-120);
        bmw.drive(-120);
        bmw.status();
        System.out.println("current position: " + bmw.getX());
        System.out.println("estimate fuel: " + bmw.getFuel());

    }
}
