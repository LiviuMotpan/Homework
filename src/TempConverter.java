public class TempConverter {

    double fahrDegrees;
    double celsiusDegrees;

    public void convertToFahr(double celsius) {
        fahrDegrees = Math.round((celsius*1.8+32)*100.0)/100.0;
        System.out.println(celsius+"°C -> "+fahrDegrees);
    }

    public void convertToCelsius(double fahr) {
        celsiusDegrees = Math.round((fahr-32)*5/9*100.0)/100.0;
        System.out.println(fahr+"°F -> "+celsiusDegrees);
    }


}
