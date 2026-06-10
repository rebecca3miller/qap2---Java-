import java.util.ArrayList;

public class CampusMap {
    
    private ArrayList<MyLine> walkways;
    private ArrayList<MyRectangle> buildings;
    private ArrayList<MyCircle> roundabouts;

    public void addBuilding(MyRectangle building) {
        buildings.add(building);
    }

    public void addWalkway(MyLine walkway) {
        walkways.add(walkway);
    }

    public void addRoundabout(MyCircle roundabout) {
        roundabouts.add(roundabout);
    }

    public void displayMap()
    {
        System.out.println("Buildings:");

        for (MyRectangle building : buildings) {
            System.out.println(building);
        }

        System.out.println("Walkways:");

        for (MyLine walkway : walkways) {
            System.out.println(walkway);
        }

        System.out.println("Roundabouts:");

        for (MyCircle roundabout : roundabouts) {
            System.out.println(roundabout);
        }
    }
}
