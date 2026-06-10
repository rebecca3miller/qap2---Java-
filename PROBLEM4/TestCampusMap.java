public class TestCampusMap {
    
    public static void main(String[] args) {
        
        CampusMap map = new CampusMap();

        MyRectangle building1 = new MyRectangle(1, 10, 6, 2);

        MyRectangle building2 = new MyRectangle(10, 12, 15, 5);

        MyLine walkway1 = new MyLine(6, 6, 10, 8);

        MyCircle fountain = new MyCircle(new MyPoint(8, 8), 3);

        map.addBuilding(building1);
        map.addBuilding(building2);
        map.addWalkway(walkway1);
        map.addRoundabout(fountain);
        map.displayMap();
    }
}
