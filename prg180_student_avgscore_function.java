/*180.	Write a program to read the student number, name, 
average score and print these details with appropriate grades by using functions? 
OUTPUT:>

Enter stud_Id,name and average score: 
4
Aniket K 
85.6

Student Details:
ID: 4
Student Name: Aniket K
score: 85.6
Grade: AWESOME
*/

import java.util.Scanner;

class prg180_student_avgscore_function{
    static void stud_info(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter stud_Id,name and average score: ");
        int id=sc.nextInt();
        String a=sc.nextLine();
String name=sc.nextLine();
double score=sc.nextDouble();
display(id,name,score);
    }
  static void display(int id,String name,double score){
    System.out.println("\nStudent Details: "+"\nID: "+id+"\nStudent Name: "+ name+"\nscore: "+ score);
    if(score<=100&&score>=75){
      System.out.println("Grade: AWESOME");
    }else if(score>=60&&score<50){
      System.out.println("Grade: BETTER");
    }else if(score>=50&&score<45){
      System.out.println("Grade: GOOD");
    }else if(score>=45&&score<35){
      System.out.println("Grade: POOR");
    }else{
      System.out.println("Grade: VERY POOR");
    }
  }
public static void main(String[] args) {
  stud_info();
}
}