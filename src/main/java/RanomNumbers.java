import java.util.Random;

public class RanomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int result =0 ;
        int sum =0;
        while (sum < 5000){
            int temp = random.nextInt(31);
            sum =sum + temp;
            result++;
        }
        System.out.println(sum);
    }
}
