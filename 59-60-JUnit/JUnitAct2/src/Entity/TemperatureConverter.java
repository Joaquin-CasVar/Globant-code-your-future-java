package Entity;

// @author Haze
public class TemperatureConverter {

    public int conversionCaK(int temp) {
        return (int) (temp + 273.15);
    }

    public int conversionCaF(int temp) {
        return (int) ((temp * 9 / 5) + 32);
    }

    public int conversionFaK(int temp) {
        return (int) ((temp - 32) * 5 / 9 + 273.15);
    }

    public int conversionFaC(int temp) {
        return (int) ((temp - 32) * 5 / 9 );
    }

    public int conversionKaC(int temp) {
        return (int) (temp - 273.15);
    }

    public int conversionKaF(int temp) {
        return (int) ((temp - 273.15) * 9 / 5 + 32);
    }
}
