// methods over-ridding can be done by using INHERITAGED class
// method dispatch means, in the program run-time which method will go for exucution. This decision taking process is the method dispatch.
// Super-class or we can say Class
class phone {
    // constructor always same-name as Class
    public phone() {
        System.out.println("Constructor of the phone");
    }

    // static methods can be called without making objects
    public void switchOn() {
        System.out.println("Switch-on function under the phone-class");
    }

    // static methods can't be over-rided, it will hide
    public static void switchOff() {
        System.out.println("Switch-off function under the phone-class");
    }
}

// Sub-class, not a Class
class smartPhone extends phone {
    // constructor always same-name as Class
    public smartPhone() {
        System.out.println("Constructor of the smartPhone");
    }

    @Override // @Override annotation can be used to check the methods are over-riding or not
    public void switchOn() {
        System.out.println("Switch-on function under the smartPhone-class");
    }

    // static variables send one copies to the all instances(objects) and can be changed making new object.
    public static String smartPhone = "Apple 14 pro max";

    // @Override // uncomment this annotation to check switchOff method over-rides or not
    public static void switchOff() {
        System.out.println("Switch-off function under the smartPhone-class using " + smartPhone);
    }

}

public class _4_methodsOverRidding {
    public static void main(String[] args) {
        // reference such as "phone" must be a Class, not the sub-class
        // using phone refrence, creating the object of smartPhone and this process is also known as method-dispatch.
        phone apple = new smartPhone(); 
        apple.switchOn();
        // static methods can be Called using the Class-name without making the objects
        // of their class
        smartPhone.switchOff();
        // Making object to change to change the value of static-variable
        // here's the method-dispatch concept will perform
        smartPhone smp = new smartPhone();
        smp.smartPhone = "Apple 15 pro max";
        smartPhone.switchOff();
    }
}
