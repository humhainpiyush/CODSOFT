import java.util.Scanner;

public class GradeCalc {
    private static float hindiMarks;
    private static float englishMarks;
    private static float mathematicsMarks;
    private static float scienceMarks;
    private static float socialScienceMarks;

    private static float totalMarks;

    private static void enterMarks(Scanner sc){
        System.out.print("Enter Hindi marks: ");
        hindiMarks = sc.nextInt();
        System.out.print("Enter English marks: ");
        englishMarks = sc.nextInt();
        System.out.print("Enter Mathematics marks: ");
        mathematicsMarks = sc.nextInt();
        System.out.print("Enter Science marks: ");
        scienceMarks = sc.nextInt();
        System.out.print("Enter Social Science marks: ");
        socialScienceMarks = sc.nextInt();
    }

    private static float calculate(Scanner sc){
        enterMarks(sc);

        totalMarks = hindiMarks + englishMarks + mathematicsMarks + scienceMarks + socialScienceMarks;
        float averageMarks = totalMarks / 5;

        return averageMarks;
    }

    private static char gradeAssignment(Scanner sc){
        float result = calculate(sc);

        if(result > 90)
            return 'A';
        else if(result >= 80)
            return 'B';
        else if(result >= 70)
            return 'C';
        else if(result >= 60)
            return 'D';
        else if(result >= 50)
            return 'E';
        else
            return 'F';
    }

    private static void displayResult(Scanner sc){
        char grade = gradeAssignment(sc);

        System.out.println();
        System.out.println("=====FINAL RESULT=====");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + (totalMarks/5) + "%");
        System.out.println("Grade: " + grade);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****GRADE CALCULATOR*****\n");
        displayResult(sc);
        sc.close();
    }
}