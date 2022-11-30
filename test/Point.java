public class Point implements Movable
    { private double x;
    private double y;
    public Point(double x, double y)
        {this.x = x;
        this.y = y;}
    public double getX()
        {return this.x;}
    public double getY()
        {return this.y;}
    public void move(double dx, double dy)
        {this.x += dx;
        this.y += dy;}
}
