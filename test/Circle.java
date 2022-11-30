public class Circle extends GeomFigure
    { private Point center;
    private double radius;
    public Circle(double centerX, double centerY, double radius, String color)
        {super(color);
        this.center = new Point(centerX, centerY);
        this.radius = radius;}
    public Point getCenter()
        {return this.center;}
    public double getRadius()
        {return this.radius;}
    public double getPerimeter()
        {return 6.283185307179586 * this.radius;}
    public double getArea()
        {return Math.PI * this.radius * this.radius;}
    public String getInfo()
        {double var10000 = this.center.getX();
        return "This is a Circle. Characteristics:\nCenter: (" + var10000 + ", " + this.center.getY() + ")\nRadius: " + this.radius + "\nColour: " + this.getColor();}
    public void move(double dx, double dy)
        {this.center.move(dx, dy);}
}