import java.util.Scanner;

public class gpa {
    public static void main(String[] args) {
        // first of taking marks from the user
        System.out.println("Enter your marks for the subject of: ");

        System.out.print("Subject-1 ");
        Scanner marks = new Scanner(System.in);
        int s1 = marks.nextInt();
        System.out.println(s1);

        System.out.print("Subject-2 ");
        Scanner marks2 = new Scanner(System.in);
        int s2 = marks2.nextInt();
        System.out.println(s2);

        System.out.print("Subject-3 ");
        Scanner marks3 = new Scanner(System.in);
        int s3 = marks3.nextInt();
        System.out.println(s3);

        System.out.print("Subject-4 ");
        Scanner marks4 = new Scanner(System.in);
        int s4 = marks4.nextInt();
        System.out.println(s4);

        System.out.print("Subject-5 ");
        Scanner marks5 = new Scanner(System.in);
        int s5 = marks5.nextInt();
        System.out.println(s5);

        // Calculating total marks of the 5 Subjects:
        System.out.print("The total marks of your 5_Subjects: ");
        int Total_marks = s1 + s2 + s3 + s4 + s5;
        System.out.println(Total_marks);

        // Calculating the average of the marks:
        System.out.print("The percentage of your marks is: ");
        int percentage = Total_marks / 5;
        System.out.println(percentage);

        // Calculating CGPA of the Students:
        System.out.print("The CGPA of the Student is: ");
        float cgpa = percentage / 10f;
        System.out.println(cgpa);

        // Calculating GPA of the Students:
        System.out.print("The GPA of the Student is: ");
        float gpa = cgpa * 0.4f; // 40/100
        System.out.println(gpa);

    }

}
