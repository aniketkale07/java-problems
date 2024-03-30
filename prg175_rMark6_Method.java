/*175.	Write a program to read the marks of 6 subjects and display the total, avg, class?
OUTPUT:>
Enter student name and class: 
Aniket k
5
Enter Marks of Subject:
45
85
95
75
15
55
Student Name: Aniket k
Class: 5
Average of Marks: 68.0
Grade: First Class
*/

import java.util.Scanner;

public class prg175_rMark6_Method {
    static String stud_name;
    static int stud_class;
    static double total;
    static double avg;
    static double m1, m2, m3, m4, m5, m6;

    static void Student(String stud_name, int stud_class, double m1, double m2, double m3, double m4, double m5,
            double m6) {
        System.out.println("Student Name: " + stud_name);
        System.out.println("Class: " + stud_class);

        total = m1 + m2 + m3 + m4 + m5 + m6;
        avg = total / 6;

    }

    static void stud_display() {
        System.out.println("Average of Marks: " + avg);
        if (avg > 75) {
            System.out.println("Grade: Distinaction");
        } else if (avg > 60 && avg <= 74) {
            System.out.println("Grade: First Class");
        } else if (avg <= 60 && avg > 50) {
            System.out.println("Grade: Second Class");

        } else if (avg <= 50 && avg > 35) {
            System.out.println("Grade: Pass");
        } else {
            System.out.println("Grade : Fail");
        }

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter student name and class: ");
            String name = sc.nextLine();
            int stud_class = sc.nextInt();
            System.out.println("Enter Marks of Subject: ");
            double m1 = sc.nextInt();
            double m2 = sc.nextInt();
            double m3 = sc.nextInt();
            double m4 = sc.nextInt();
            double m5 = sc.nextInt();
            double m6 = sc.nextInt();

            Student(name, stud_class, m1, m2, m3, m4, m5, m6);

            stud_display();
        }

    }

}
