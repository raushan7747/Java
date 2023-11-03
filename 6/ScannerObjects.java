import java.util.Scanner;
public class ScannerObjects {
    public static void main(String[] args) {
        System.out.println("Enter your Name: ");
        Scanner ob = new Scanner (System.in);
        String name = ob.nextLine(); // this [ob] Scanner-Object will Scan the whole nextline using [nextLine()]
                                     // Function, and the similar is-> next(); nextInt(); nextFloat(); nextLine();
        System.out.println("This is " +name+ " what are you waiting for" );
        System.out.println(ob.hasNextInt()); // ob.hasNextInt -> ob is the object to use the Scanner class
                                            // hasNextInt is the [function] which checks the Scanner class
                                            // input is the integer type or, not?
                                            // Also, we need to just call the Scanner class object[ob] to
                                            // use the Class feature, as Scanner to be used to Scan inputs
    }
}
