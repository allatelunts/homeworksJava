package overload;

public class TempConversion {
    public static void main(String[] args) {
        double tempC = 25.0;
        int tempF = 77;

        double fahrenheit = convertTemperature(tempC);
        System.out.println(tempC + "°C is " + fahrenheit + "°F");

        double celsius = convertTemperature(tempF);
        System.out.println(tempF + "°F is " + celsius + "°C");
    }

    static double convertTemperature(double celsius) {

        if (celsius < -273.15) {
            System.out.println("Error: Temperature below absolute zero is not valid.");
            System.exit(1);
        }
        return (celsius * 9/5) + 32;
    }

    static double convertTemperature(int fahrenheit) {
        if (fahrenheit < -459.67) {
            System.out.println("Error: Temperature below absolute zero is not valid.");
            System.exit(1);
        }
       return ( fahrenheit - 32) * 5.0/9.0;
    }


}