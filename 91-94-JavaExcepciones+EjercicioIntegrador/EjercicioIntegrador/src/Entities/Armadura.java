package Entities;

// @author Haze
public class Armadura {

    private String colorPrimario;
    private String colorSecundario;
    private Dispositivo botas;
    private Dispositivo guantes;
    private int nivelResistencia;
    private int salud;
    private float energia; //esta en kWh
    private Dispositivo consola;
    private Dispositivo sintetizador;
    private ObjetoRadar[] objetos;

    private static final float ENERGIAMAX = 1000000;
//    private static final float ENERGIAMAX = Float.MAX_VALUE;

    private static final String[] MATERIALES = {"SAE1020", "SAE1045", "ALUMINIO", "ACERO INOX."};
    private static final int[] RESISTENCIAS = {86, 92, 60, 89};

    public Armadura() {
    }

    public Armadura(String colorPrimario, String colorSecundario, Dispositivo botas, Dispositivo guantes, int nivelResistencia, int salud, float energia, Dispositivo consola, Dispositivo sintetizador) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.botas = botas;
        this.guantes = guantes;
        this.nivelResistencia = nivelResistencia;
        this.salud = salud;
        this.energia = energia;
        this.consola = consola;
        this.sintetizador = sintetizador;
        this.objetos = new ObjetoRadar[10];
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public Dispositivo getBotas() {
        return botas;
    }

    public void setBotas(Dispositivo botas) {
        this.botas = botas;
    }

    public Dispositivo getGuantes() {
        return guantes;
    }

    public void setGuantes(Dispositivo guantes) {
        this.guantes = guantes;
    }

    public int getNivelResistencia() {
        return nivelResistencia;
    }

    public void setNivelResistencia(int nivelResistencia) {
        this.nivelResistencia = nivelResistencia;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }

    public Dispositivo getConsola() {
        return consola;
    }

    public void setConsola(Dispositivo consola) {
        this.consola = consola;
    }

    public Dispositivo getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(Dispositivo sintetizador) {
        this.sintetizador = sintetizador;
    }

    public ObjetoRadar[] getObjetos() {
        return objetos;
    }

    public void setObjetos(ObjetoRadar[] objetos) {
        this.objetos = objetos;
    }

    public static float getENERGIAMAX() {
        return ENERGIAMAX;
    }

    public static String[] getMATERIALES() {
        return MATERIALES;
    }

    public static int[] getRESISTENCIAS() {
        return RESISTENCIAS;
    }

    @Override
    public String toString() {
        return "Armadura " + colorPrimario + " y " + colorSecundario + 
                "\nBotas: " + botas + "\nGuantes: " + guantes + "\nConsola: " + consola + "\nSintetizador: " + sintetizador
                + "\nResistencia: " + nivelResistencia + ", Salud: " + salud + ", Energia: " + energia + "kWh";
    }

}
