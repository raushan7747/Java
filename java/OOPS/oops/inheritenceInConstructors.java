package oops;

import java.io.*;
import java.lang.*;

// user-defined class, superCLass is also known as baseClass or parentClass
class superClass {
    // Constructor(like methods, with no return-value)
    superClass() {
        System.out.println("This Constructor is under the Super Class");
    }
    superClass(String constructorOverLoading) {
        System.out.println("This Constructor is under the Super Class with Over Loading the Constructor " + constructorOverLoading);
    }
}
// subClassChild is the INHERITANCE of superClass, which is also known as childClass or derivedClass
class subClassChild extends superClass {
    subClassChild() {
        System.out.println("This Constructor is under the Sub-Class");
    }
    subClassChild(String constructorOverLoading) {
        // When we want to use the parent-class constructor and also wants to pass the arguements to the parent-class, then
        super(constructorOverLoading); // this (super-keyword) is used to through out with arguements to the parent-class 
        System.out.println("This Constructor is under the Sub-Class with Over Loading the Constructor " + constructorOverLoading);
    }
}

public class inheritenceInConstructors {
    public static void main(String[] args) {
// Constructors are also INHERITAGED to the childClass also, first parent-class constructors will INVOKED and then childClass
        // superClass superClassObject = new superClass();
        subClassChild subClassObject = new subClassChild();
       subClassObject = new subClassChild(", and this is (Arguements in the Constructor).");
    }
}
