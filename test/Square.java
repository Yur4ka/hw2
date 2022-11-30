import java.util.List;
public class Square extends Rhombus {
    public Square(List<Point> listPoint, String color)
        {super(listPoint, color);
        super.setDiagonals(listPoint);}
    public double getLargerDiagonal()
        {return super.getLargerDiagonal();}
    public double getSmallerDiagonal()
        {return super.getSmallerDiagonal();}
    public String getInfo()
        {String var10000 = this.getPoints();
        return "This is Square. Characteristics:\nCoordinates: " + var10000 + "\nColor: " + this.getColor();}
}