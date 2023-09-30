/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homeworka;
      import java.util.Scanner;

/**
 *
 * @author kelvi
 */
public class HomeworkA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hello world!");
         
  
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Generate a random ID number
        int randomId = (int) (Math.random() * 1000);

        // Display a personalized greeting with the random ID
        System.out.println("Hello, " + name + "! Your ID number is: " + randomId);

        // Close the scanner
        scanner.close();
    }
}

    
    

