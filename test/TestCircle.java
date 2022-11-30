public class TestCircle {
    public TestCircle() {}

    public static void main(String[] args)
        {GeomFigure circle = new Circle(3.0, 4.0, 4.0, "GREEN");
        System.out.println(circle.getColor());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(circle.getInfo());
        System.out.println("==========");
        circle.setColor("RED");
        System.out.println(circle.getColor());
        System.out.println(circle.getInfo());
        System.out.println("==========");
        circle.move(100.0, 100.0);
        System.out.println(circle.getInfo());}
}