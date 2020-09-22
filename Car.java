//9. Реализуйте класс Саг, моделирующий передвижение автомобиля на бензиновом топливе по оси х. Предоставьте методы для передвижения автомобиля на
//        заданное количество километров, заполнения топливного бака заданным количеством литров бензина, вычисления расстояния, пройденного от начала
//        координат, а также уровня топлива в баке. Укажите расход топлива (в км/л)
//        в качестве параметра конструктора данного класса. Должен ли этот класс быть
//        неизменяемым и почему?
public class Car {
    private double x = 0;
    private double fuel = 0;
    private int fuelTankCapacity;
    private double fuelConsumption;

    public Car(int fuelTankCapacity, double fuelConsumption) {
        this.fuelTankCapacity = fuelTankCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public void fill(double fuel) {
        if (fuel < 0) {
            System.out.println("dont steal my fuel!");
            return;
        }
        if (fuel <= fuelTankCapacity - this.fuel) {
            this.fuel += fuel;
        } else {
            this.fuel = fuelTankCapacity;
            System.out.println("tank is full");
        }
    }

    public void drive(double distance) {
        if (Math.abs(distance) <= fuelConsumption * fuel) {
            this.x += distance;
            fuel -= Math.abs(distance) / fuelConsumption;
        } else {
            System.out.println("not enough fuel");
            status();
        }
    }

    public void status() {
        System.out.println("current status: ");
        System.out.println("fuel tank capacity: " + fuelTankCapacity);
        System.out.println("fuel: " + fuel);
        System.out.println("current position: " + x);
        System.out.println("fuel consumption (km/l): " + fuelConsumption);
        System.out.println("estimate distance: " + fuelConsumption * fuel);
        System.out.println();
    }

    public double getX() {
        return x;
    }

    public double getFuel() {
        return fuel;
    }

}