/* dryRun means the : Whenever we don't want to repeat my task, we put our code to the Function and
 * whenever we needed just call them to repeat the same tasks, there may be need to calculate even
 * most complex formulas, and we don't wanna to be repeat that complex formulas when we needed to
 * do even more than a time. So, the another way is that, we just call our function to do that 
 * type of work as much better
 */


import java.util.*;

public class dryRun {

    void printing_crds() {
        System.out.print("Enter your Age: ");
        Scanner taking_input = new Scanner(System.in); // taking_input is the object of [Scanner-Class]
        int age = taking_input.nextInt();
        System.out.println(age);

        System.out.print("Enter your e-mail id here: ");
        Scanner inputs = new Scanner(System.in); // inputs is the object of [Scanner-Class]
        String user_name = inputs.nextLine();
        System.out.println(user_name);

        System.out.println("You enter your age is: " + age + " and your e-mail id is: " + user_name);
    }

    public static void main(String[] args) {

        // we are trying to execute some codes under the function call
        dryRun classMainObject = new dryRun();
        classMainObject.printing_crds();
        classMainObject.printing_crds();

    }
}
