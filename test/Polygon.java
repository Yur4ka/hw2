import java.util.Iterator;
import java.util.List;
public class Polygon extends GeomFigure implements WithAngles
    { private List<Point> pointList;
    private int numberPoints;
    public Polygon(List<Point> pointList, String color)
        {super(color);
        this.pointList = pointList;
        this.numberPoints = pointList.size();}
    public double getPerimeter()
        {double perimeter = 0.0;
        double x0 = ((Point)this.pointList.get(0)).getX();
        double y0 = ((Point)this.pointList.get(0)).getY();
        for(int i = 1; i <= this.numberPoints; ++i)
            {int index = i % this.numberPoints;
            double x1 = ((Point)this.pointList.get(index)).getX();
            double y1 = ((Point)this.pointList.get(index)).getY();
            double xDiff = Math.abs(x1 - x0);
            double yDiff = Math.abs(y1 - y0);
            double lengthBetweenPoints = Math.sqrt(Math.pow(xDiff, 2.0) + Math.pow(yDiff, 2.0));
            perimeter += lengthBetweenPoints;
            x0 = x1;
            y0 = y1;}
        return perimeter;}
    public double getArea()
        {double s1 = 0.0;
        double s2 = 0.0;
        for(int i = 0; i < this.numberPoints - 1; ++i)
            {s1 += ((Point)this.pointList.get(i)).getX() * ((Point)this.pointList.get(i + 1)).getY();
            s2 += ((Point)this.pointList.get(i + 1)).getX() * ((Point)this.pointList.get(i)).getY();}
        s1 += ((Point)this.pointList.get(this.numberPoints - 1)).getX() * ((Point)this.pointList.get(0)).getY();
        s2 += ((Point)this.pointList.get(0)).getX() * ((Point)this.pointList.get(this.numberPoints - 1)).getY();
        double area = Math.abs(s1 - s2) / 2.0;
        return area;}
    public String getInfo()
        {int var10000 = this.numberPoints;
        return "This is a polygon. Characteristics:\nThere are " + var10000 + " coordinates: " + this.getPoints() + "\nColor: " + this.getColor();}
    public void outputCoordinatesOfPoints()
        {System.out.println(this.getPoints());}
    protected String getPoints()
        {StringBuilder stringPoints = new StringBuilder();
        Iterator var2 = this.pointList.iterator();
        while(var2.hasNext())
            {Point point = (Point)var2.next();
            double var10001 = point.getX();
            stringPoints.append("(" + var10001 + ", " + point.getY() + ") ");}
        return stringPoints.toString();
    }

    public void move(double dx, double dy)
        {Iterator var5 = this.pointList.iterator();
        while(var5.hasNext()) {
            Point point = (Point)var5.next();
            point.move(dx, dy);}

    }
}