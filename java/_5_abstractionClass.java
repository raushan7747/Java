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

// Concrete class -> multiple abstract classes are not allowed to implement
class subClass extends superAbstractClass {
    @Override
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
        // we can take the reference only of the abstract class, do not make objects
        // from the abstract class taking super-class refrence we are limited to access
        // only super-class methods and variables, not subclass properties
        // typecasting the Super-class instance(object) into the sub-class instance(object)

        /*
         * if condition ke andar hum check kar rhen ki, agar SuperClass ka refrence ya
         * instance(object or behave like variable) hai aur hum us refrence me sub-class
         * ka object banakar daal rhen hain to hum bas Super-Class ke saare methods ko
         * execute kar sakte agar sub-class me koi aisa method hai, jo ki Super-class me
         * nhi hai, to hum us method ko use nhi kar payenge, agar Super-class ka hum 
         * refrence use kar rhen hain to. 
         * wahin hum super-class ke refrence ko agar sub-class ke refrence se
         * type-casting karte hain toh hum Super-class ke saare methods aur 
         * sub-class ke bhi har ik methods ko use kar poayene.
         */

        /*
         * #code (superAbstractClassReference instanceof subClass)# iska matlab hai ki
         * hum check kar rhen hain ki, agar humara super-class ka jo refrence
         * (like varaible) hai woh agar sub-class ke instances(sub-class objects)
         * store karta hai toh hum if condition ko satisfy kar lenge.
         * Ab condition satisfy hone ke baad humara type-casting ka code
         * execute karega, jo ki neeche maine likha hai.
         * #code subClass subClassRef = (subClass) superAbstractClassReference;#
         * is code me hum sub-class ke refrence(like variable) ko declare kar
         * rhen hain jo ki #subClassRef# (variable) ke naam se hai, to hum is
         * variable me ab super-class ke refrence(variable) jo ki
         * #superAbstractClassReference# hai use hum type casting operator
         * jo ki #(subClass)# hai, hum use #subClassRef(variable) me daal rhen.
         * #code (subClass) superAbstractClassReference# isme #(subClass)#
         * type-caste converting operator ki tarah work kar rha, jo ki
         * #superAbstractClassReference# super-class ke refrence ko
         * explicitly sub-class me convert kar rha hai bas.
         * #code superAbstractClass superAbstractClassReference#
         * jis tarah se hum yahan super-class ke refrence(variable)
         * declare kar rhen, pehle class ka naam phir us class ka refrence(variable)
         * usi tarah se hum if condition ke andar bhi same kam kar rhen hain
         * #code (subClass) superAbstractClassReference# isme bhi humne
         * super-class ke refrence ko bas explicitly super-class me type-cast kar
         * rhen, bas yahan hume class ko parenthesis me close karna hoga, kyunki 
         * yeh ik explicit type conversion hai, jaise ki C programming me bhi
         * type conversion ke liye parenthesis ka use kiya jata hai. 
         * for ex_ int number; char[] name; yeh abhi implicitly integer type ka hai
         * ab ise hum explicitly type-conversion ke liye kuchh is tarah se
         * likhenge, #code char[] = (char) number;# ab humne number ko explicitly
         * character-type me convert kar diya.
         * SUMMARY_ parenthesis() are used to explicitly type-conversion of
         * any variable, and we need to define ki hum use kis type me convert
         * karna chahte hain, woh hum parenthesis ke under declare karenge.
         * 
         */

    public class _5_abstractionClass {

    public static void main(String[] args) {

    superAbstractClass superAbstractClassReference = new subClass();

        if (superAbstractClassReference instanceof subClass) {
            // downCasting
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
 * Hum agar Super-class ka refrence use kar rhen hain to hum, apne sub-class ke
 * methods ko access nhi kar sakte
 * wahin, jab hum sub-class ka refrence use karenge toh, super aur sub-class
 * dono ke methods aur variables acess kar sakte hain
 * for ex_ given below operation we can't perform
 * superAbstractClass subRefrence = new subClass();
 * subRefrence.nonAbstract2();
 */