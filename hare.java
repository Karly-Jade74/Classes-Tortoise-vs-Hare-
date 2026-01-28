import java.util.Random;

public class Hare extends Racer {
    private double arrogance;

    public Hare(String name, double arrogance) {
        super(name, 10.0, 15.0);
        this.arrogance = arrogance;
    }

    @Override
    public void run(double timeIntervalInSeconds) {
        Random rand = new Random();
        double chance = rand.nextDouble();

        if (chance < arrogance) {
            System.out.println(name + " takes a nap");
        } else {
            double speed = minSpeedInMetersPerSecond + (maxSpeedInMetersPerSecond - minSpeedInMetersPerSecond) * rand.nextDouble();
            double distance = speed * timeIntervalInSeconds; 
            distanceCoveredInMeters += distance;

            System.out.printf("%s hops %.2f meters; now at marker %.2f\n", name, distance, distanceCoveredInMeters);
        }
    }
}

