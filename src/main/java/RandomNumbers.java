import java.util.Random;

public class RandomNumbers {
    int max = 0;
    int min = 30;

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.drawNumbers();

    }

    public void drawNumbers() {
        Random random = new Random();
        int sum = 0;

        while (sum < 5000) {
            int temp = random.nextInt(31);
            getMin(temp);
            getMax(temp);
            sum = sum + temp;
        }
    }

    public int getMin(int number) {
        if (number < min) {
            min = number;
        }
        return min;
    }

    public int getMax(int number) {
        if (number > max) {
            max = number;
        }
        return max;
    }
}
