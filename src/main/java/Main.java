/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){

        Scanner in = new Scanner(System.in); //Create a Scanner Object

        System.out.print("Please enter your name: ");
        String userName = in.nextLine(); //prompt user to input name

        // check if the name is Alice or Bob
        if (userName.equals("Alice") || userName.equals("Bob")) {
            System.out.println(userName +"!!!  I'm so happy to see you!");
        } else {
            // sassy VI
            System.out.println("Oh... nevermind. Bye.");
        }

    }
}
