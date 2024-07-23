import java.util.*;

public class array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] marksArr={523,450,350,650,720,222,645,555};
        System.out.println("Enter the size of array");
        int noOfStudents=marksArr.length;
        int n=sc.nextInt();
        int[] newMarksArr=new int[n];

        System.out.println("Enter the marks of student");
        for(int i=0;i<n;i++){
            int studentsMarks=sc.nextInt();
            newMarksArr[i]=studentsMarks;
        }
        System.out.println("Marks of students ");
        for(int i=0;i<n;i++){

            System.out.println(newMarksArr[i]);
        }

    }
}
