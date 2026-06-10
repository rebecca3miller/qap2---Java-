import java.util.ArrayList; // calling this imports Arraylist class from the java.util package.

public class CampusMap {
    
    // private instance variables.
    private ArrayList<MyLine> walkways;
    private ArrayList<MyRectangle> buildings;
    private ArrayList<MyCircle> roundabouts;

    // constructor
    public CampusMap()
    {
        buildings = new ArrayList<MyRectangle>();
        walkways = new ArrayList<MyLine>();
        roundabouts = new ArrayList<MyCircle>();
    }

    // add method
    public void addBuilding(MyRectangle building) {
        buildings.add(building);
    }

    public void addWalkway(MyLine walkway) {
        walkways.add(walkway);
    }

    public void addRoundabout(MyCircle roundabout) {
        roundabouts.add(roundabout);
    }

    // display method.
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
