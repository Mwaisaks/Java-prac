import java.util.Random;

public class Rand {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("Exploring the Random class in Java");

        //Common Methods
        //nextInt(int bound): Generate a random integer between 0(inclusive) and bound(exclusive).
        int randomNum = rand.nextInt(50); // generates a no. from 0-49
        System.out.println("Random Number: "+randomNum);
        
        //nextDouble(): Generates a random double between 0.0(inc) and 1.0 (Exclusive)
        double randomDouble = rand.nextDouble();
        System.out.println("Random Double: "+ randomDouble);

        //nextBoolean(): Generates a random boolean either true or false
        boolean randomBool = rand.nextBoolean();
        System.out.println("Random bool: "+ randomBool);

    }
}

/*
 * Seeding the Random Generator:

When you create a Random object, Java uses the current time as the seed by default. However, you can set a fixed seed if you need reproducible results for testing.
Random randSeeded = new Random(42); // Fixed seed for consistent results
Using Random for Ranges:

To get random values in specific ranges, adjust the result. For example:

int randomInRange = rand.nextInt(50) + 1; // 1 to 50
double randomRange = 5 + (10 - 5) * rand.nextDouble(); // 5.0 to 10.0
 */
