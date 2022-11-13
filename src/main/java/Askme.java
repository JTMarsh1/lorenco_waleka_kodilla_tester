import java.util.Scanner;

public class Askme {

    public static String getAskmee() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select your letter of color ");
            String letters = scanner.nextLine().trim().toUpperCase();
            switch (letters) {
                case "R":
                    return "RED";
                case "B":
                    return "BLUE";
                case "G":
                    return "GREEN";
                case "Y":
                    return " YELLOW";
                default:
                    System.out.println("Wrong letter. Try again.");
            }
        }
    }
}