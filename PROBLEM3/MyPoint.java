public class MyPoint {

    // private instance variables
    private int x;
    private int y;

    // Constructors
    public MyPoint() 
    {
        x = 0;
        y = 0;
    }


    public MyPoint(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }   

    // getter methods
    public int getX() 
    {
        return x;
    }

    public void setX(int x) 
    {
        this.x = x;
    }

    public int getY() 
    {
        return y;
    }

    // setter method
    public void setY(int y) 
    {
        this.y = y;
    }

    // method.
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}