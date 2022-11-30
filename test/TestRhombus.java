import java.util.ArrayList;
import java.util.List;
public class TestRhombus {
    public TestRhombus() {}
    public static void main(String[] args)
        {List<Point> listRhombus = new ArrayList();
        listRhombus.add(new Point(3.0, 6.0));
        listRhombus.add(new Point(5.0, 2.0));
        listRhombus.add(new Point(7.0, 6.0));
        listRhombus.add(new Point(5.0, 10.0));
        GeomFigure rhombus = new Rhombus(listRhombus, "WHITE");
        System.out.println(rhombus.getColor());
        System.out.println(rhombus.getPerimeter());
        System.out.println(rhombus.getArea());
        System.out.println(rhombus.getInfo());
        System.out.println("==========");
        rhombus.move(100.0, 100.0);
        System.out.println(rhombus.getInfo());}
}
