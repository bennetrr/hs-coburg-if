public class Triangle {
    private final Point p1;
    private final Point p2;
    private final Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point p1() {
        return p1;
    }

    public Point p2() {
        return p2;
    }

    public Point p3() {
        return p3;
    }

    public double perimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

public double area() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
