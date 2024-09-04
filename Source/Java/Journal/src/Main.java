
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String csvFilePath = "day_answer.csv";
        boolean running = true;


        System.out.println("                 ___====-_  _-====___");
        System.out.println("           _--^^^#####//      \\\\#####^^^--_");
        System.out.println("        _-^##########// (    ) \\\\##########^-_");
        System.out.println("       -############//  |\\^^/|  \\\\############-");
        System.out.println("     _/############//   (@::@)   \\\\############\\_");
        System.out.println("    /#############((     \\\\//     ))#############\\");
        System.out.println("   -###############\\\\    (oo)    //###############-");
        System.out.println("  -#################\\\\  / VV \\  //#################-");
        System.out.println(" -###################\\\\/      \\/###################-");
        System.out.println("_#/|##########/\\######(   /\\   )######/\\##########|\\#_");
        System.out.println("|/ |#\\/\\#\\/\\/  \\#\\/##\\  |  |  /##\\/\\#/  \\/\\#\\/\\#| \\|");
        System.out.println("`  |/  V  V  `   V  \\#\\| |  | |/#/  V   '  V  V  \\|  '");
        System.out.println("   `   `  `      `   / | |  | | \\   '      '  '   '");
        System.out.println("                    (  | |  | |  )");
        System.out.println("                   __\\ | |  | | /__");
        System.out.println("                  (vvv(VVV)(VVV)vvv)");
        System.out.println("========================================================");
        System.out.println("                        THE MENU                        ");
        System.out.println("========================================================");
        System.out.println("= Create              ");
        System.out.println("= Edit                ");
        System.out.println("= Exit                ");
        System.out.println("= Search                ");
        System.out.println("=====================");
        System.out.println("What is youre Choice: ");

        while (running) {
            String choice = scanner.nextLine();

            switch (choice.toLowerCase()) {
                case "1":
                case "create":
                    // Handle create operation
                    System.out.print("Enter Report Date: ");
                    String date = scanner.nextLine();
                    System.out.print("Tell about your day: ");
                    String answer = scanner.nextLine();

                    try (FileWriter writer = new FileWriter(csvFilePath, true)) {
                        writer.append(date).append(",").append(answer).append("\n");
                        System.out.println("\nThe answer has been saved in the CSV file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred while saving to the CSV file.");
                        e.printStackTrace();
                    }
                    break;

                case "2":
                case "edit":
                    // Placeholder for edit functionality
                    System.out.print("Which date would you like to edit? ");
                    String editDate = scanner.nextLine();
                    // Implement the logic for editing the CSV file based on the date
                    System.out.println("Edit functionality not yet implemented.");
                    break;

                case "3":
                case "search":
                    // Handle search operation
                    System.out.print("Enter the value you want to search: ");
                    String searchValue = scanner.nextLine().trim();

                    boolean found = false;

                    try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            String[] values = line.split(",");
                            for (String value : values) {
                                if (value.contains(searchValue)) {

                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }

                                    System.out.println("===================");
                                    System.out.println("Found  " + line);

                                    found = true;
                                }
                            }
                        }
                    } catch (IOException e) {
                        System.out.println("An error occurred while reading the CSV file.");
                        e.printStackTrace();
                    }

                    if (!found) {
                        System.out.println("No such day.");
                    }
                    break;


                case "4":
                case "exit":

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    running = false;

                    System.out.println("                             ");
                    System.out.println("                       \"\"   ,d     ");
                    System.out.println("                            88     ");
                    System.out.println(" ,adPPYba, 8b,     ,d8 88 MM88MMM  ");
                    System.out.println("a8P_____88  `Y8, ,8P'  88   88     ");
                    System.out.println("8PP\"\"\"\"\"\"\"    )888(    88   88     ");
                    System.out.println("\"8b,   ,aa  ,d8\" \"8b,  88   88,    ");
                    System.out.println(" `" + "Ybbd8\"' 8P'     `Y8  88   \"Y888  ");
                    System.out.println("                                         ");
            }

        }
        scanner.close();
    }
}
