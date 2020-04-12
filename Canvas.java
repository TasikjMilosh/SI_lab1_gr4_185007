import java.util.LinkedList;

public class Canvas<Points> {
    LinkedList<Points> Point = new LinkedList<>();

    public Canvas(LinkedList<Points> point) {
        Point = point;
    }

    public LinkedList<Points> getPoint() {
        return Point;
    }

    void addPoint()
    {
        Point.add();
    }

    void deleteAll()
    {
        Point.clear();
    }
}
