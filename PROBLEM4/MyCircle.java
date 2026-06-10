public class MyCircle {

    // private instance variables.
    private MyPoint center;
    private int radius;

    // constructor
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    // getter method.
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    // string method.
    public String toString() {
        return ("Circle center = " + center + "Circle radius = " + radius);
    }
}
