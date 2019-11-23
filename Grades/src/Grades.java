import java.util.Random;

/**
 * This program computes GPA's of a series of students.
 * 
 * References: 
 * 
 * @author Angela Preziuso
 * @version 10/9/2015
 */
public class Grades {
  public static void main(String[] args)
  {
    GradesIO IO = new GradesIO();
    GradeCalculator calc = new GradeCalculator();
    IO.displayGreeting();
    
    do {
    int gradeCount;
    String name;

    double qualityPoints;
    double totalPoints = 0;
    double gpa;
    String grade;
    int credits;
    int totalCredits = 0;
    
    name = IO.readName();
    gradeCount = IO.readGradeCount();
    for (int i = 0; i < gradeCount; i++) {
      grade = IO.readGrade(i + 1); 
      credits = IO.readCredits();
      qualityPoints = calc.calcQualityPoints(grade, credits);
      if (qualityPoints >= 0) {
        totalCredits += credits;
        totalPoints += qualityPoints;
      }
    
    }
    gpa = calc.calcGPA(totalPoints, totalCredits);
    IO.displayResult(name, gradeCount, gpa);
  } while (IO.goAgain() == true);
  }
}