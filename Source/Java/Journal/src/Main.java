import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDate;

// Simple comment change for tests

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("               THE MENU              ");
        System.out.println("=====================================");
        System.out.println("= Create              ");
        System.out.println("= Edit                ");
        System.out.println("=====================================");
        System.out.println("What is youre Choice: ");

        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("create")) {
            System.out.print("Enter Report Date: ");
            String date = scanner.nextLine();
            System.out.print("Tell about your day: ");


            String answer = scanner.nextLine();
            String FileSave = ("Aimen Said: " + answer);
            System.out.println(FileSave);

            System.out.print("\nThe Answers is Saved im a CSV file");


            String csvFilePath = "day_answer.csv";
            try (FileWriter writer = new FileWriter(csvFilePath, true)) {

                writer.append(date + " " + answer + "\n");
                writer.append("\n");

            } catch (IOException e) {
                System.out.println("An error occurred");
                e.printStackTrace();
            }




        }
        else if (choice.equalsIgnoreCase("edit")) {
            System.out.print("which Date is it daddy?");
        }

        scanner.close();
    }
}