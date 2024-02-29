/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        // create a new object of class Main
        String name;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        if (name.equals("Alice") || name.equals("Bob")){
            System.out.println("Hello " + name + "!");
        }

        // Print "You are neither Alice nor Bob." otherwise
        else {
            System.out.println("You are neither Alice nor Bob.");
        }
        scanner.close();
    }
}
