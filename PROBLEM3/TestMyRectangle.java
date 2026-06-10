public class TestMyRectangle {
    
    public static void main(String[] args) {
        
        MyRectangle rec1 = new MyRectangle(1, 8, 6, 2);

        System.err.println(rec1);
        System.err.println("Width: " + rec1.getWidth());
        System.err.println("Height: " + rec1.getHeight());
        System.err.println("Area: " + rec1.getArea());
        System.err.println("Perimeter: " + rec1.getPerimeter());

    }
}
