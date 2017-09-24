import java.util.Random;

public class Randomize {

    public static int randomize(int limit) {
        Random random = new Random();
        int randomNumber = random.nextInt(limit);
        return randomNumber;
    }
}
