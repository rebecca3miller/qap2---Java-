public class MyRectangle {
    
    // private instance variables.
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // constructors
    public MyRectangle(int x1, int y1, int x2, int y2) {
        topLeft = new MyPoint(x1, y1);
        bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    //getter methods
    public double getWidth() 
    {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    public double getHeight() 
    {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    public double getArea()
    {
        return getWidth() * getHeight();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // method
    public String toString() 
    {
        return ("Top left of Rectangle =" + topLeft + "Bottom right of Rectangle =" + bottomRight);
    }
}
