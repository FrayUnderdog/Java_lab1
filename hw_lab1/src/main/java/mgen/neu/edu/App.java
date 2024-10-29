package mgen.neu.edu;

/**
 * Hello world!
 *
 */
import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        // Part 1 - Arrays
        int[] x = {1, 18, 99, 69, 11};
        int[] y = {69, 49, 101, 11, 91};
        int[] z = new int[5];

        // z = max of the respective elements of x and y
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        // Print arrays
        System.out.println("Array x = " + Arrays.toString(x));
        System.out.println("Array y = " + Arrays.toString(y));
        System.out.println("Array z = x + y = " + Arrays.toString(z));

        // Part 2 - ArrayList
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Jupiter", "Moon", "Charlie", "Lebron", "James"));
        
        // Process names to switch the first and last letters
        ArrayList<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            if (name.length() > 1) {
                String switchedName = name.charAt(name.length() - 1) + name.substring(1, name.length() - 1) + name.charAt(0);
                switchedName = switchedName.substring(0, 1).toUpperCase() + switchedName.substring(1).toLowerCase();
                switchedNames.add(switchedName);
            } else {
                switchedNames.add(name);  // If the name is 1 character long, no switch is needed
            }
        }

        // Print the names in the specified format
        System.out.println("\nNames = " + names);
        System.out.println("Names (switched) = " + switchedNames);
    }
}

