import java.util.Scanner;

public class Askme {
    public static String getAskme() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your first letter of the color");
            String letter = scanner.nextLine().trim();
            if (letter.length() <= 2) {
                return letter;
            }
            System.out.println("Use only one letter");
        }
    }

    public static String getAskmee() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select your letter (R, B, G, Y,");
            String letter = scanner.nextLine().trim().toUpperCase();
            switch (letter) {
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
        System.out.println("Chose your letter R, B, G, Y:");
        String val= scanner.nextLine();
        return  val;
    }
}

