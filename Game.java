import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        String[] options = {"Rock", "Paper", "Scissors"};
        String gameChoice = getGameChoice(options);
        String userChoice = getUserChoice(options);
        printResult(userChoice, gameChoice);
    }

    public static String getGameChoice(String[] optionsParam) {
        Random random = new Random();
        return optionsParam[random.nextInt(optionsParam.length)];
    }

    public static String getUserChoice(String[] optionsParam) {
        boolean isValidChoice = false;
        String userChoice = "";
        Scanner scanner = new Scanner(System.in);

        while (!isValidChoice) {
            System.out.print("Please enter one of the following:");
            for (String item : optionsParam) {
                System.out.print(" " + item);
            }
            System.out.println(".");

            String userInput = scanner.nextLine();

            if (userInput != null && userInput.trim().length() > 0) {
                for (String option : optionsParam) {
                    if (userInput.equalsIgnoreCase(option)) {
                        isValidChoice = true;
                        userChoice = userInput;
                        break;
                    }
                }
            }

            if (!isValidChoice) {
                System.out.println("You must enter a valid choice.");
            }
        }
        return userChoice;
    }

    public static void printResult(String userChoice, String gameChoice) {
        String result;

        if (userChoice.equals(gameChoice)) {
            result = "Tie!";
        } else if ((userChoice.equals("Rock") && gameChoice.equals("Scissors")) ||
                (userChoice.equals("Paper") && gameChoice.equals("Rock")) ||
                (userChoice.equals("Scissors") && gameChoice.equals("Paper"))) {
            result = "You win!";
        } else {
            result = "You lose!";
        }

        System.out.println("You chose " + userChoice + ". I chose " + gameChoice + ". " + result);
    }
}

