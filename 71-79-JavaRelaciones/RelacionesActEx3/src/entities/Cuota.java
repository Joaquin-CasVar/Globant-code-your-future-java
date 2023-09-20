package entities;

// @author Haze
import java.util.Date;

public class Cuota {

    private int numDeCuota;
    private double totDeCuota;
    private boolean pagada;
    private Date fechaVencimiento;
    private String formaDePago;

    public Cuota() {
    }

    public Cuota(int numDeCuota, double totDeCuota, boolean pagada, Date fechaVencimiento, String formaDePago) {
        this.numDeCuota = numDeCuota;
        this.totDeCuota = totDeCuota;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaDePago = formaDePago;
    }

    public int getNumDeCuota() {
        return numDeCuota;
    }

    public void setNumDeCuota(int numDeCuota) {
        this.numDeCuota = numDeCuota;
    }

    public double getTotDeCuota() {
        return totDeCuota;
    }

    public void setTotDeCuota(double totDeCuota) {
        this.totDeCuota = totDeCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

}
