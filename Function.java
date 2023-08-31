import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        // we are trying to execute some codes under the function call

        System.out.print("Enter your Age: ");
        Scanner taking_input = new Scanner(System.in); // taking_input is the object of [Scanner-Class]
        int age = taking_input.nextInt();
        System.out.println(age);

        System.out.print("Enter your e-mail id here: ");
        Scanner inputs = new Scanner(System.in); // inputs is the object of [Scanner-Class]
        String user_name = inputs.nextLine();
        System.out.println(user_name);

        System.out.println("You enter your age is: " +age+ " and your e-mail id is: " +user_name );
    }
}
/*
 * Har ik Class ka uska ik specific task hota hai -> koi bhi Class hume sirf 1 hi kaam karke dega aur har ik Class ka apna ik ->
 * specific[khaas] object hota hai, aur object ka kaam hota hai Class ke function ko poora karne karne ke liye ik memory space ->
 * allow karwana. Yani ki hum kah sakte hain ki, Class ik type hai jiska use hum apne compiler ko yeh batane ke liye karte hain ->
 * ki hum kaun sa task karwana chahte hain, aur us task ko hum complete karke kis jagah [As Variable] store karwana chahte hain ->
 * yeh hum Object ko declare karke batate hain.
 */

 /* Har ik task ke liye hume alag alag Classes aur uske Objects banane parenge, Har 1 object sirf aur sirf ik hi task ko kar sakta->
  * sabhi Objects humesha ik dusre se different hone chahiye, aur kisi bhi Variable ki hum copy nhi bana sakte, yani ki hum ->
  * har ik value ke liye alag alag variables banane parenge jo ki unique honge, kisi ke jaise same nhi ho sakte.
  * hum alag alag objects isliye banate hain, taaki un objects me jo hum values store karen woh bilkul [Unique] hon ->
  * har ik Class, Object aur us Object ke andar stored jo Values honge woh Humesha unique honge, hum use change nhi kar sakte.
  * Har different values ke liye hume different Classes, Objects aur Objects ke andar Variables bilkul [UNIQUE] banane honge.
  */