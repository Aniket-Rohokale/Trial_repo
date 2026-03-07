
public class MathOperationsDemo
 {

    // --- Custom Overloaded Power Methods ---

    /**
     * Computes the power of a double base raised to a double exponent.
     * Delegates the actual calculation to the static Math.pow method.
     */
    public static double power(double base, double exponent) 
    {
        System.out.println("Using custom power(double, double)");
        return Math.pow(base, exponent);
    }

    /**
     * Computes the power of an int base raised to an int exponent.
     * Casts inputs to double for calculation using Math.pow and returns a double.
     */
    public static double power(int base, int exponent) 
    {
        System.out.println("Using custom power(int, int)");
        return Math.pow((double) base, (double) exponent);
    }

    /**
     * Computes the power of a float base raised to a float exponent.
     * Casts inputs to double for calculation using Math.pow and returns a double.
     */
    public static double power(float base, float exponent) 
    {
        System.out.println("Using custom power(float, float)");
        return Math.pow((double) base, (double) exponent);
    }

    // --- Custom Overloaded Absolute Methods ---

    /**
     * Computes the absolute value of a double.
     * Delegates the actual calculation to the static Math.abs method.
     */
    public static double absolute(double value) 
    {
        System.out.println("Using custom absolute(double)");
        return Math.abs(value);
    }

    /**
     * Computes the absolute value of an int.
     * Delegates the actual calculation to the static Math.abs method.
     */
    public static int absolute(int value)
     {
        System.out.println("Using custom absolute(int)");
        return Math.abs(value);
    }

    /**
     * Computes the absolute value of a float.
     * Delegates the actual calculation to the static Math.abs method.
     */
    public static float absolute(float value) 
    {
        System.out.println("Using custom absolute(float)");
        return Math.abs(value);
    }

    /**
     * Computes the absolute value of a long.
     * Delegates the actual calculation to the static Math.abs method.
     */
    public static long absolute(long value) 
    {
        System.out.println("Using custom absolute(long)");
        return Math.abs(value);
    }

    // --- Main method to demonstrate usage ---

    public static void main(String[] args) 
    {
        System.out.println("--- Demonstrating Custom Overloaded Methods ---");

        // Demonstration of overloaded power()
        System.out.println("\n*** Power Calculations ***");
        System.out.printf("power(2, 3) (int): %.1f\n", power(2, 3));
        System.out.printf("power(2.5, 2.0) (double): %.1f\n", power(2.5, 2.0));
        System.out.printf("power(3.0f, 2.0f) (float): %.1f\n", power(3.0f, 2.0f));

        // Demonstration of overloaded absolute()
        System.out.println("\n*** Absolute Value Calculations ***");
        System.out.printf("absolute(-10) (int): %d\n", absolute(-10));
        System.out.printf("absolute(-5000000000L) (long): %d\n", absolute(-5000000000L));
        System.out.printf("absolute(-3.14) (double): %.2f\n", absolute(-3.14));
        System.out.printf("absolute(-0.5f) (float): %.1f\n", absolute(-0.5f));

        System.out.println("\n--- Demonstrating Direct Usage of Java Math Class Static Methods ---");

        // Direct use of static methods from the built-in Math class
        System.out.println("\n*** Direct Math Class Usage ***");
        // The Java compiler automatically selects the correct static method based on input types
        System.out.println("Math.pow(4, 0.5): " + Math.pow(4, 0.5));
        System.out.println("Math.abs(-20): " + Math.abs(-20));
        System.out.println("Math.abs(-9.99f): " + Math.abs(-9.99f));
        System.out.println("Math.abs(-100L): " + Math.abs(-100L));
    }
}
