package conversorum;

public class ConversorUM {

    public static void main(String[] args) {
        conversor miConv = new conversor();
    
        double millas = miConv.convertirKm_Millas(10.0);
        double gradosF = miConv.convertirCelsius_Fahrenheit(25.0);
    
        System.out.println("10km en millas: " + millas);
        System.out.println("25C en Fahrenheit: " + gradosF);
    }
    
}
