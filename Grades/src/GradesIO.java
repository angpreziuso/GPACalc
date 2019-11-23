import java.util.Scanner;

/**
 * This program computes GPA's of a series of students.
 * 
 * References:
 * 
 * @author Angela Preziuso
 * @version 10/9/2015
 */
public class GradesIO {

  private Scanner scan = new Scanner(System.in);
  /**
   * Displays the greeting.
   * 
   * @param 
   * @return
   */
  public void displayGreeting() {
    System.out.print("Welcome to the JMU GPA calculator\n\n");
  }
  /**
   * Reads the name that is entered
   * 
   * @param 
   * @return name 
   *    that user enters.
   */
  public String readName() {
    String name;

    System.out.print("Student name: ");
    name = scan.nextLine();

    return name;
  }
  /**
   * Read the amount of grades
   * 
   * @param 
   * @return count
   *    how many grades are going to be entered.
   */
  public int readGradeCount() {
    int count = 0;
    boolean validInput = false;
    System.out.print("How many grades? ");

    while (!validInput) {
      if (scan.hasNextInt()) {
        count = scan.nextInt();
        scan.nextLine();
        if (count > 0) {
          validInput = true;
        } else if (count <= 0) {
          System.out.print("Bad value - " + count + "\n");
          System.out.print("How many grades? ");
        }
      } else {
        String badValue;
        badValue = scan.nextLine();
        System.out.print("Bad value - " + badValue + "\n");
        System.out.print("How many grades? ");
      }
    }
    return count;
  }
  /**
   * Reads the grades that are entered.
   * 
   * @param count
   * @return grade that is entered
   */
  public String readGrade(int count) {
    String grade = null;
    boolean valid = false;
    GradeCalculator calc = new GradeCalculator();

    while (!valid) {
      System.out.print("Grade " + count + ": ");
      grade = scan.nextLine();
      if (calc.isGrade(grade)) {
        valid = true;
      } else {
        System.out.print("Bad grade - " + grade + "\n");
      }
    }

    return grade;

  }
  /**
   * Reads the number of credits
   * 
   * @param 
   * @return credit 
   *      number of credits for the given class
   */
  public int readCredits() {
    System.out.print("Credits: ");
    boolean validInput = false;
    int credits = 0;

    while (!validInput) {
      if (scan.hasNextInt()) {
        credits = scan.nextInt();
        scan.nextLine();
        if (credits > 0) {
          validInput = true;
        } else if (credits <= 0) {
          System.out.print("Bad value - " + credits + "\n");
          System.out.print("Credits: ");
        }
      } else {
        String badValue;
        badValue = scan.nextLine();
        System.out.print("Bad value - " + badValue + "\n");
        System.out.print("Credits: ");
      }
    }
    return credits;
  }
  /**
   * Displays the results including name, number of classes, and GPA
   * 
   * @param String name, int classes, double gpa
   * @return
   */
  public void displayResult(String name, int classes, double gpa) {

    System.out.printf("%s: Courses: %d GPA: %.3f\n", name, classes, gpa);
  }
  /**
   * Loops the program so that once the program finishes
   * it asks the user if they have another student's gpa to be 
   * calculated.
   * 
   * @param 
   * @return result
   *    it will either ask for the new person's name or the 
   * program will end.
   */
  public boolean goAgain() {
    String again;
    boolean result = false;

    System.out.print("Calculate another? ");
    again = scan.nextLine();
    if (again.equalsIgnoreCase("yes") || again.equalsIgnoreCase("y")) {
      result = true;
    }
    return result;
  }
}