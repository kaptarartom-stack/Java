package lab2;

// Клас точки
public class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Переміщення по X
    public void moveX(float value) {
        x += value;
    }

    // Переміщення по Y
    public void moveY(float value) {
        y += value;
    }

    // Відстань до початку координат
    public double distanceStart() {
        return Math.sqrt(x * x + y * y);
    }

    // Відстань між двома точками
    public double distanceBetweenTwoPoints(Point point) {
        float dx = x - point.x;
        float dy = y - point.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    // Перетворення в полярні координати
    public void toPolar() {
        double r = Math.sqrt(x * x + y * y);
        double phi = Math.toDegrees(Math.atan2(y, x));

        System.out.println("r = " + r);
        System.out.println("phi = " + phi + "°");
    }

    // Перевірка співпадання
    public boolean match(Point point) {
        return x == point.x && y == point.y;
    }

    // Виведення координат
    public void print() {
        System.out.println("(" + x + "; " + y + ")");
    }
}
