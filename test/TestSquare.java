import java.util.ArrayList;
import java.util.List;
public class TestSquare {
    public TestSquare() {}
    public static void main(String[] args)
        {List<Point> listSquare = new ArrayList();
        listSquare.add(new Point(1.0, 1.0));
        listSquare.add(new Point(1.0, 5.0));
        listSquare.add(new Point(5.0, 5.0));
        listSquare.add(new Point(5.0, 1.0));
        GeomFigure square = new Square(listSquare, "RED");
        System.out.println(square.getColor());
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());
        System.out.println(square.getInfo());
        System.out.println("==========");
        square.move(100.0, 100.0);
        System.out.println(square.getInfo());}
}