package oops;
/* Constructors can be placed at anywhere in the Class
 * constructors name must be same as class name
 * constructors don't need to have return value
 * constructors don't need to invoke manually, like - [emp1.setEmployeeName]
 * constructors will automatically invoked, when we're making objects, 
 * for example - [constructorOfEmoployee emp1 = new constructorOfEmoployee();]
 * constructors will also work as methods, and could have arguements aslo
 */
public class constructors {

    public static void main(String[] args) {
        class constructorOfEmoployee { // user-defined custom-class
            private String EmployeeName;
            private String EmployeeId;

            public void setEmployeeName(String userGivenName) {
                EmployeeName = userGivenName; // Name given by user puts into the Employee name
            }

            public String getEmployeeName() {
                return EmployeeName; // To return the value stored in Employe Name
            }

            public void setEmployeeId(String userGivenName) {
                EmployeeId = userGivenName; // Name given by user puts into the Employee name
            }

            public String getEmployeeId() {
                return EmployeeId; // To return the value stored in Employe Name
            }

            // Defining-Constructor, as same as Setter-method
            public constructorOfEmoployee(String userName, String userId) {
                EmployeeName = userName;
                EmployeeId = userId;
            }
        }

        constructorOfEmoployee emp1 = new constructorOfEmoployee("Raushan", "EC23310");
        // emp1.setEmployeeName("Raushan-Kumar"); // known as Setters
        System.out.println("Employee Name: " + emp1.getEmployeeName()); // known as Getters
        // emp1.setEmployeeId("EC203312196"); // known as Setters
        System.out.println("Employee ID: " + emp1.getEmployeeId()); // known as Getters
    }

}
/*
 * When we are using Constructors, we don't need to put values manually into the variables defined in a class
 * for example - emp1.setEmployeeName("Employee Name: " + "Raushan-Kumar");
 * emp1.setEmployeeId("Employee ID: " + "EC203312196");
 * or,we can say Constructors will work also as Setters and we can replace it by Setters-method
 */