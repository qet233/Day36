package Day15.Num1;

public class Rectangle extends Shape{
    private double lengths;
    private double wide;

    public Rectangle() {
    }

    public Rectangle(double lengths, double wide) {
        this.lengths = lengths;
        this.wide = wide;
    }

    public double getLengths() {
        return lengths;
    }

    public void setLengths(double lengths) {
        this.lengths = lengths;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    @Override
    public double area() {
        return lengths*wide;
    }

    @Override
    public double perimeter() {
        return (wide+lengths)*2;
    }
}
