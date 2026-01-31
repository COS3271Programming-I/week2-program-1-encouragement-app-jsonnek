// Jonathan Sonnek
// January 30, 2025
// Encouraging Message

import java.util.Scanner;
public class Message {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        System.out.println("Please enter your First Name:");
        String firstName;
        firstName = userinput.nextLine();

        System.out.println("Please enter your Middle Name:");
        String middleName;
        middleName = userinput.nextLine();

        System.out.println("Please enter your Last Name:");
        String lastName;
        lastName = userinput.nextLine();

        String message = "Good job " + firstName + " " + middleName + " " + lastName
                + ", keep up the great work! You are doing amazing! \uD83D\uDCAA \uD83C\uDF1F \uD83D\uDE0A";

        System.out.println(message);
        userinput.close();
    }
}
