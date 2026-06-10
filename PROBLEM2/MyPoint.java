public class MyPoint {

    // private instance variables
    private int x;
    private int y;

    // constructor.
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }   

    // getter and setter methods.
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // method.
    public double distance(int x, int y)
     {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
     }

     public double distance(MyPoint another)
     {
        return Math.sqrt((this.x - another.x) * (this.x - another.x) + (this.y - another.y) * (this.y - another.y));
     }

     public double distance() 
     {
        return Math.sqrt(x * x + y * y);
     }
     
     public String toString() {
        return "(" + x + ", " + y + ")";
    }
}