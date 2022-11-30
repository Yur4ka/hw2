import java.util.ArrayList;
import java.util.List;
public class TestPolygon {
    public TestPolygon() {}

    public static void main(String[] args)
        {List<Point> listPolygon = new ArrayList();
        listPolygon.add(new Point(12.0, 8.0));
        listPolygon.add(new Point(5.0, 11.0));
        listPolygon.add(new Point(3.0, 4.0));
        listPolygon.add(new Point(5.0, 6.0));
        listPolygon.add(new Point(9.0, 5.0));
        GeomFigure polygon = new Polygon(listPolygon, "BLUE");
        System.out.println(polygon.getColor());
        System.out.println(polygon.getPerimeter());
        System.out.println(polygon.getArea());
        System.out.println(polygon.getInfo());
        System.out.println("==========");
        polygon.move(100.0, 100.0);
        System.out.println(polygon.getInfo());}
}