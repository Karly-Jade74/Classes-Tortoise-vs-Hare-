import java.util.Random;

public class Tortoise extends Racer {

    public Tortoise(String name) {
        super(name, 2.0, 3.0); 
    }

    @Override
    public void run(double timeIntervalInSeconds) {
        Random rand = new Random();
        double speed = minSpeedInMetersPerSecond + (maxSpeedInMetersPerSecond - minSpeedInMetersPerSecond) * rand.nextDouble();
        double distance = speed * timeIntervalInSeconds; 
        distanceCoveredInMeters += distance;

        System.out.printf("%s walks %.2f meters; now at marker %.2f\n", name, distance, distanceCoveredInMeters);
    }
}
