/*
 * we can't make objects of the ABSTRACT class
 * minimum 1 abstact class be there in the abstract class
 * when we extend abstract class, must be define the abstract method
 */
abstract class superAbstractClass {
    public superAbstractClass() {
        System.out.println("Constructor of the superAbstract class");
    }

    public void nonAbstract() {
        System.out.println("This is the non abstract-method");
    }

    // abstract method, defined in the child class(sub-class)
    abstract public void checking();
}
// Concrete class
class subClass extends superAbstractClass {
    public void checking() {
        System.out.println("This is the definition of the abstract method");
    }

    public void nonAbstract2() {
        System.out.println("This is the second non abstract-method");
    }
}

class secondSubClass extends superAbstractClass {
    @Override
    public void checking() {
        System.out.println("The second sub-Class with the definition of abstracted method");
    }

    public void checking2() {
        System.out.println("The second sub-Class");
    }
}

public class _5_abstractionClass {
    public static void main(String[] args) {
        // we can take the reference only of the abstract class, do not make objects from the abstract class
        // taking super-class refrence we are limited to access only super-class methods and variables, not subclass properties
        superAbstractClass superAbstractClassReference = new subClass();
        // typecasting the Super-class instance(object) into the sub-class instance(object)
        /*
         * if condition ke andar hum check kar rhen ki, agar SuperClass ka refrence ya instance(object or behave like variable) hai ->
         * aur hum us refrence me sub-class ka object banakar daal rhen hain to hum bas Super-Class ke saare methods ko execute kar sakte ->
         * agar sub-class me koi aisa method hai, jo ki Super-class me nhi hai, to hum us method ko use nhi kar payenge, agar Super-class ->
         * ka hum refrence use kar rhen hain to.
         * wahin hum super-class ke refrence ko agar sub-class ke refrence se type-casting karte hain toh hum Super-class ke saare methods ->
         * aur sub-class ke bhi har ik methods ko use kar poayene.
         */
        if (superAbstractClassReference instanceof subClass) {
            subClass subClassRef = (subClass) superAbstractClassReference;
            subClassRef.checking();
        }
        // reference.checking();
        // reference.nonAbstract();
        // // taking the refrence of subclass to acess both super and sub-class methods
        // secondSubClass subClassRefrence = new secondSubClass();
        // subClassRefrence.checking();
        // subClassRefrence.checking2();
    }
}
/*
 * Hum agar Super-class ka refrence use kar rhen hain to hum, apne sub-class ke methods ko access nhi kar sakte
 * wahin, jab hum sub-class ka refrence use karenge toh, super aur sub-class dono ke methods aur variables acess kar sakte hain
 * for ex_ given below operation we can't perform
 * superAbstractClass subRefrence = new subClass();
 * subRefrence.nonAbstract2();
 */