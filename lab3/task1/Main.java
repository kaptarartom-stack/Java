class Vehicle {
    protected String name;
    protected int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void Show() {
        System.out.println("Транспортний засіб: " + name + ", Швидкiсть: " + speed + " км/г");
    }
}
class Car extends Vehicle{
    private String fuelType;
    public Car(String name, int speed, String fuelType) {
        super(name, speed);
        this.fuelType = fuelType;
    }

    @Override
    public void Show() {
        System.out.println("Машина: " + name + ", Швидкiсть: " + speed + " км/г, Пальне: " + fuelType);
    }

}
class Train extends Vehicle{
    int carriageCount;
    public Train(String name, int speed, int carriageCount) {
        super(name, speed);
        this.carriageCount = carriageCount;
    }

    @Override
    public void Show() {
        System.out.println("Потяг: " + name + ", Швидкiсть: " + speed + " км/г, Кiлькiсть вагонiв: " + carriageCount);
    }

}
class Express extends Train {
    private String route;
    public Express(String name, int speed, int carriageCount, String route) {
        super(name, speed, carriageCount);
        this.route = route;
    }

    @Override
    public void Show() {
        System.out.println("Експрес: " + name + ", Швидкiсть: " + speed + " км/г, Кiлькiсть вагонів: " + carriageCount + ", Маршрут: " + route);
    }
    
}
public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[] {
            new Vehicle("Generic Vehicle", 80),
            new Car("Toyota", 180, "Gasoline"),
            new Train("Intercity", 140, 10),
            new Express("Hyundai", 200, 8, "Kyiv-Lviv")
        };

        for (Vehicle v : vehicles) {
            v.Show();
        }
    }
}