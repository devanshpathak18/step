/*
 * UC3: Display "Hello" with Command-Line Argument or Default Message
 * 
 * This program accepts a user's name as a command-line argument
 * and displays a personalized greeting. If no name is provided,
 * it defaults to "World".
 * 
 * Usage: java assignments [name]
 * Example 1: java assignments Devansh  -> Hello, Devansh!
 * Example 2: java assignments          -> Hello, World!
 */
public class assignments {
    public static void main(String[] args) {
        String name = "World"; // default value

        if (args.length > 0) {
            name = args[0];
        }

        System.out.println("Hello, " + name + "!");
    }
}
