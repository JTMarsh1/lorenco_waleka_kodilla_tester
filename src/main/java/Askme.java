import java.util.Scanner;

public class Askme {

    public static String getAskmee() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select your letter of color (R, B, G, Y),");
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

    public static String getAskmeee() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Chose one letter of color (R, B, G, Y) ");
            String letter = scanner.nextLine().trim();
            if (letter.length() <= 1) {
                return letter;
            }
            System.out.println("You need to chose one letter:");
        }
    }
}

