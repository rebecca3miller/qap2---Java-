public class MyPoint {

    // private instance variables.
    private int x;
    private int y;

    //constructors
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

    // getter and setter methods
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

    public void setY(int y) 
    {
        this.y = y;
    }

    // string method.
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
