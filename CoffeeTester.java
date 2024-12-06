import java.util.Scanner;

public class CoffeeTester {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        // Creating two instances of Coffee
        Coffee coffee1 = new Coffee();
        Coffee coffee2 = new Coffee("Espresso", 200);

        // Displaying default coffee information
        System.out.println("Default Coffee:");
        System.out.println(coffee1);

        // Displaying custom coffee information
        System.out.println("\nCustom Coffee:");
        System.out.println(coffee2);

        // Testing the riskyAmount method
        System.out.println("\nRisky Amount of Coffee 2:");
        System.out.println("Cups: " + coffee2.riskyAmount());

        // Testing the equals method
        System.out.println("\nAre coffee1 and coffee2 the same? " + coffee1.equals(coffee2));

        // Allowing user to set new values for coffee1
        System.out.print("\nEnter a name for coffee1: ");
        String name = key.nextLine();
        coffee1.setName(name);

        System.out.print("Enter caffeine content for coffee1 (50-300 mg): ");
        int caffeineContent = key.nextInt();
        coffee1.setCaffeineContent(caffeineContent);

        // Displaying updated coffee1 information
        System.out.println("\nUpdated Coffee1:");
        System.out.println(coffee1);

        // Testing the riskyAmount method with updated coffee1
        System.out.println("\nRisky Amount of Updated Coffee1:");
        System.out.println("Cups: " + coffee1.riskyAmount());

        
    }
}
