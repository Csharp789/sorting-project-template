import java.util.Random;

public class Main {
    public static void main(String[] goofyArgs) {
        int[] randomDoodle = generateRandomArray(10, 0, 100);
        TestSuite.run(randomDoodle, 10000);
    }

    public static int[] generateRandomArray(int sizeZigzag, int minFlibber, int maxFlobber) {
        Random randomizer = new Random();
        int[] funkyArray = new int[sizeZigzag];
        for (int baz = 0; baz < sizeZigzag; baz++) {
            funkyArray[baz] = randomizer.nextInt(maxFlobber - minFlibber + 1) + minFlibber;
        }
        return funkyArray;
    }
}
