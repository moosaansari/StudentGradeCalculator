import java.util.*;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Student Name: ");
        String name = sc.nextLine();

        System.out.println("Enter your marks out of 100: ");
        int marks = sc.nextInt();

        System.out.println("Enter Maths Marks");
        int maths = sc.nextInt();

        System.out.println("Enter Physics Marks");
        int physics = sc.nextInt();

        System.out.println("Enter Chemistry Marks");
        int chemistry = sc.nextInt();

        System.out.println("Enter English Marks");
        int english = sc.nextInt();

        System.out.println("Enter Hindi Marks");
        int hindi = sc.nextInt();

        int total = maths+physics+chemistry+english+hindi;
        double percentage = total/5.0;

        char grade;

        if (percentage>=90) {
            grade = 'A';
        }else if (percentage>=75){
            grade = 'B';
        }else if (percentage>=60){
            grade ='C';
        }else if (percentage>=40){
            grade = 'D';
        }else{
            grade = 'F';
        }

        System.out.println("<--------Student Report Card-------->");
        System.out.println("Name: "+name);
        System.out.println("total: "+total);
        System.out.println("Percentage: "+percentage);
        System.out.println("Grade: "+grade);
        System.out.println("-------------------------------------");

    }
}
