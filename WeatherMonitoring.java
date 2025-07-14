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
    }

}