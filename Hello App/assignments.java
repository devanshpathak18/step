/*
 * UC2: Display "Hello" with Command-Line Argument
 * 
 * This program accepts a user's name as a command-line argument
 * and displays a personalized greeting message.
 * 
 * Usage: java assignments <name>
 * Example: java assignments Devansh
 * Output: Hello, Devansh!
 */
public class assignments {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello, " + args[0] + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}
