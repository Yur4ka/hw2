
import java.util.List;
public class Rhombus extends Polygon implements Diagonals
    { private double largerDiagonal;
    private double smallerDiagonal;
    public Rhombus(List<Point> pointList, String color)
        {super(pointList, color);
        this.setDiagonals(pointList);}
    protected void setDiagonals(List<Point> pointList)
        {double xDiffFirst = Math.abs(((Point)pointList.get(2)).getX() - ((Point)pointList.get(0)).getX());
        double yDiffFirst = Math.abs(((Point)pointList.get(2)).getY() - ((Point)pointList.get(0)).getY());
        double xDiffSecond = Math.abs(((Point)pointList.get(3)).getX() - ((Point)pointList.get(1)).getX());
        double yDiffSecond = Math.abs(((Point)pointList.get(3)).getY() - ((Point)pointList.get(1)).getY());
        this.largerDiagonal = Math.sqrt(xDiffFirst * xDiffFirst + yDiffFirst * yDiffFirst);
        this.smallerDiagonal = Math.sqrt(xDiffSecond * xDiffSecond + yDiffSecond * yDiffSecond);
        if (this.largerDiagonal < this.smallerDiagonal)
            {double t = this.largerDiagonal;
            this.largerDiagonal = this.smallerDiagonal;
            this.smallerDiagonal = t;}
        }
    public String getInfo()
        {String var10000 = this.getPoints();
        return "This is a rhombus. Characteristics:\nCoordinates: " + var10000 + "\nLength of the larger diagonal: " + this.getLargerDiagonal() + "\nLength of the smaller diagonal: " + this.getSmallerDiagonal() + "\nColor: " + this.getColor();}
    public double getLargerDiagonal()
        {return this.largerDiagonal;}
    public double getSmallerDiagonal()
        {return this.smallerDiagonal;}
}