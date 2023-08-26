import java.util.Scanner; // to use [sc] object from the [Scanner] to take inputs

public class first {
    public static void main(String[] args) {
        System.out.println("Enter your values -> which is String type: ");
        Scanner scannerObject = new Scanner(System.in); // scannerObject is the (object) of [Scanner -> Class]
        // String name = sc.next(); // this will scan and print the next 1
        // token(string,or words) only
        // taking input into [name] and perform by [next()] function ->
        // passed through by [sc] object, which carry the input objects

        String name = scannerObject.nextLine(); // this will scan and print the next 1 LINE (string, or words) only
        // String name = sc.nextInt(); // this will scan and print the next 1 LINE
        // (Integer type values) only
        // String name = sc.nextFloat(); // this will scan and print the next 1 LINE
        // (Float values) only

        System.out.println(name); // just print with Next Line the value in [name]

    }
}
// [name] this local variable cant't be duplication, because if we already used
// above then this will
// take only 1 input value[that is given by user]