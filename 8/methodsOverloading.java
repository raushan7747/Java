public class methodsOverloading {
    // creating some methods with same variable-names
    static void arithmeticOperations() {
        int a = 5, b = 25;
        int summation = a + b;
        System.out.println("The sum of a + b is: " + summation);
    }

    static void arithmeticOperations(int a) {
        int b = 25;
        int multiplication = a * b;
        System.out.println("The multiply of a * b is: " + multiplication);
    }

    static void arithmeticOperations(int a, int b) {
        int modulas = a % b;
        System.out.println("The modulas of a % b is: " + modulas);
    }

    public static void main(String[] args) {
        int a = 10, b = 90;
        arithmeticOperations();
        arithmeticOperations(a);
        arithmeticOperations(a, b);
        System.out.println("\nOverall methods name are the same but have different Parameters " + "so, we can use the same methods name into the other methods, return type never matter. " + "Need to have some different paremeters only to use the same methods name " + "And, this one scenario well knkown as methods-overloading");
    }

}
