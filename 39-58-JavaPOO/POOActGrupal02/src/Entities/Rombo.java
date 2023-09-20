package Entities;

// @author Haze
public class Rombo {
    private double lado;
    private double d1;
    private double d2;

    public Rombo() {
    }

    public Rombo(double lado, double d1, double d2) {
        this.lado = lado;
        this.d1 = d1;
        this.d2 = d2;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }
    
    
}
