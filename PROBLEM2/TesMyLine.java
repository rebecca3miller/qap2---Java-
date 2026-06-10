public class TesMyLine {
    public static void main(String[] args) {

    // only when you create an object, the compiler will allocate memory for the attributes of the class and you can use them.
    MyPoint P1 = new MyPoint(1, 2);
    MyPoint P2 = new MyPoint(5, 6);

    MyLine line1 = new MyLine(P1, P2);

    // Print statements so that we can display output.
    System.out.println(line1);

    System.out.println("Begin X: " + line1.getBeginX());
    System.out.println("Begin Y: " + line1.getBeginY());

    System.out.println("End X: " + line1.getEndX());
    System.out.println("End Y: " + line1.getEndY());

    System.out.println("Length: " + line1.getLength());
    System.out.println("Gradient: " + line1.getGradient());

    line1.setBeginXY(3, 4);

    System.out.println("Updated Line: " + line1);

    }
}