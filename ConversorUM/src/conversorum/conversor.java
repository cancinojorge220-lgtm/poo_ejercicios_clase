package conversorum;
public class conversor {
    private double valor;
    
    public conversor() {
        valor = 0;
    }
    
    //Convertir de km a millas
    public double convertirKm_Millas (double km){
        return km * 0.621;
    }
    
    //Celcius a Fahrenheit
    public double convertirCelsius_Fahrenheit (double celcius){
        return (celcius * 1.8) + 32;
    }
}
