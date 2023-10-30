/* dryRun means the : Whenever we don't want to repeat my task, we put our code to the Function and
 * whenever we needed just call them to repeat the same tasks, there may be need to calculate even
 * most complex formulas, and we don't wanna to be repeat that complex formulas when we needed to
 * do even more than a time. So, the another way is that, we just call our function to do that 
 * type of work as much better
 * one more thing, that's why we should to do dry run is that, particular code block can be checked easily, and this practice enhance the code re-usibility and maintanence while updating the code or when we add new things, or also it is easily understandable and more visible to the naive user also.
we can test that particular code to find any problems if they exist, that's why we should practice to keep the almost code blocks in Functions for the dry run maintanence also.
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
