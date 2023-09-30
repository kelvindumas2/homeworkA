/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homeworka;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kelvi
 */
public class HomeworkA {
    private static final List<Integer> usedIds = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");

  
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int randomId = generateUniqueRandomId();

        System.out.println("Hello, " + name + "! Your ID number is: " + randomId);

        // Close the scanner
        scanner.close();
    }


    private static int generateUniqueRandomId() {
        Random random = new Random();
        int randomId;
        do {
            randomId = random.nextInt(1000);
        } while (usedIds.contains(randomId));
        
        usedIds.add(randomId);
        return randomId;
    }
}

