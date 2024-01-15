package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public static void toFahrenheit(float temperatureCelsius){
        float result = temperatureCelsius*9/5+32;
        System.out.println(result);}
    public static void main (String[]args)
    {
        float temperatureCelsius=1;
        toFahrenheit(temperatureCelsius);
    }
}

