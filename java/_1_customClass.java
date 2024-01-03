/*
 * keep it up in your mind that, custom classes are always kept in the top of public class
 */
import java.util.*;

class Students {
    String program;
    // ""String program"" likes an ADT in C-langugae --> and the custom-classes are
    // like to be Structures in C-language

    // Taking user details, with the help of method in class-Students
    static void takeInputs() {
        Scanner takingDetails = new Scanner(System.in);
        System.out.print("\nEnter your full Name: ");
        String takingName = takingDetails.nextLine();
        System.out.println("Name: " + takingName);

        System.out.print("\nEnter your e-mail address: ");
        String takingMail = takingDetails.nextLine();
        System.out.println("E-mail: " + takingMail);

        System.out.print("\nEnter your city: ");
        String takingCity = takingDetails.nextLine();
        System.out.println("City: " + takingCity);

        System.out.print("\nEnter your residential address: ");
        String takingAddress = takingDetails.nextLine();
        System.out.println("Residential-address: " + takingAddress);

    }

}

public class _1_customClass {

    public static void main(String[] args) {
        // creating new-object
        Students Raushan = new Students();
        /*
         * Students raushan --> Raushan is an object(like variables), which holds the
         * proerties/attributes of class Students
         * new Students(); --> means, we're creating a new object from class Studnets
         */
        // using custom-class properties/attributes in our object
        Raushan.program = "Online-BCA";
        System.out.println("You're Looking for " + Raushan.program);
        // calling a method from class-Students in Raushan-named object
        Raushan.takeInputs();

        // creating second entity(or, object)
        Students Aakash_Tripathi = new Students();
        Aakash_Tripathi.program = "Online-BCA";
        System.out.println("\nYou're Looking for " + Aakash_Tripathi.program);
        Aakash_Tripathi.takeInputs();

    }
}