import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
class WeatherMonitoring{
    public static void main(String[] args) {
        //write a code to solve a quadtaratic equation which takes input as time(variable time) and solves a quadratic equation to predict the weather condition
        double a = 1.0; // Coefficient for t^2
        double b = 2; // Coefficient for t
        double c = 15; // Constant term
        double time = 10; // Example input for time
        double solution=a * time * time + b * time + c;
        System.out.println("Weather condition at time " + time + " is: " + solution);
        System.out.println("Weather Monitoring System Initialized");



        //read the inputs of the quadratic equation from a file and solve the equation
        try {
            BufferedReader reader = new BufferedReader(new FileReader("weather_single.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    a = Double.parseDouble(parts[0].trim());
                    b = Double.parseDouble(parts[1].trim());
                    c = Double.parseDouble(parts[2].trim());
                    solution = a * time * time + b * time + c;
                    System.out.println("Weather condition at time " + time + " with coefficients (" + a + ", " + b + ", " + c + ") is: " + solution);
                }
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error reading input file: " + e.getMessage());
        }
        //read multiple inputs of the quadratic equation from a file and solve the equation
        try {
            BufferedReader reader = new BufferedReader(new FileReader("weather_multiple.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    a = Double.parseDouble(parts[0].trim());
                    b = Double.parseDouble(parts[1].trim());
                    c = Double.parseDouble(parts[2].trim());
                    solution = a * time * time + b * time + c;
                    System.out.println("Weather condition at time " + time + " with coefficients (" + a + ", " + b + ", " + c + ") is: " + solution);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading input file: " + e.getMessage());
        }

        //read the inputs from the user and solve the equation
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coefficients a, b, c for the quadratic equation (separated by spaces):");
        if (scanner.hasNextDouble()) {
            a = scanner.nextDouble();
        }
        if (scanner.hasNextDouble()) {
            b = scanner.nextDouble();
        }
        if (scanner.hasNextDouble()) {
            c = scanner.nextDouble();
        }
        System.out.println("Enter time:");
        if (scanner.hasNextDouble()) {
            time = scanner.nextDouble();
        }   
        solution = a * time * time + b * time + c;
        System.out.println("Weather condition at time " + time + " with coefficients (" + a + ", " + b + ", " + c + ") is: " + solution);
    }

}
