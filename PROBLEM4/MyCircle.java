public class MyCircle {

    private MyPoint center;
    private int radius;

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return ("Circle center = " + center + "Circle radius = " + radius);
    }
}
