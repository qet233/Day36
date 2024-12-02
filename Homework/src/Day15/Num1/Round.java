package Day15.Num1;

public class Round extends Shape{
    private double pi =3.14;
    private double r;

    public Round() {
    }

    public Round(double r) {
        this.r = r;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return r*r*pi;
    }

    @Override
    public double perimeter() {
        return 2*pi*r;
    }
}
