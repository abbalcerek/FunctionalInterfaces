package pl.balcerek.functionalinterfaces;

public class Parabola implements FunDD {

    private double a;
    private double b;
    private double c;

    public Parabola(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double fun(double x) {
        return x * x * a + x * b + c;
    }

    @Override
    public String toString() {
        return String.format("%sx^2 + %sx + %s", a, b, c);
    }

}
