import java.util.*;
public class loops {
    public static void main(String[] args)
    {
        System.out.println("Enter your name");
        Scanner scanObject = new Scanner(System.in);
        String taking_inputs = scanObject.nextLine();
        for (int i = 0; i<4; i++)
        {
            System.out.printf("\n Your most Welcome! %s\n\n",taking_inputs);
        }
        /* we need to use the [printf] function to print the whole format with the [format specifier]
         * [println] or [print] is usesd to print only the strings not with the format specifier
         */
    }
    
}
