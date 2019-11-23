import java.util.Scanner;

/**
 * This program computes GPA's of a series of students.
 * 
 * References:TA Blake Gabe
 * 
 * @author Angela Preziuso
 * @version 10/9/2015
 */
public class GradeCalculator {
  /**
   * Calculates the number of points for the GPA. (Grades * Credits)
   * Calculates and return the quality points for that course
   * as a double
   * 
   * @param String
   *            grade grades that are entered & passed through qualityPoints()
   * @param credits
   *            number of credits the grades are
   * @return number of points
   */
  public double calcQualityPoints(String grade, int credits) {
    double grades = qualityPoints(grade);
    return grades * credits;
  }

  /**
   * Calculates GPA
   * 
   * @param points
   *            points of all the grades and credits
   * @param hours
   *            number of credit hours
   * @return gpa - number of points divided by credit hours
   */
  public double calcGPA(double points, int hours) {
    if (hours == 0) {
      return 0;
    } else {
      return points / hours;
    }
  }

  /**
   * Allows these grades to be valid and used in the GPA calculator.
   * 
   * @param grade
   *            the letter grades (with +/-)
   * 
   * @return true or false
   *      regarding what the input is
   */
  private boolean isGPAGrade(String grade) {
    if (grade.equals("A") || grade.equals("a") || grade.equals("A-") 
        || grade.equals("a-") || grade.equals("B+")
            || grade.equals("b+") || grade.equals("B") || grade.equals("b") 
        || grade.equals("b-") || grade.equals("B-") || grade.equals("C+")
        || grade.equals("c+") || grade.equals("C") || grade.equals("c") 
        || grade.equals("C-") || grade.equals("c-") || grade.equals("D+")
        || grade.equals("d+") || grade.equals("D") || grade.equals("d") 
        || grade.equals("D-") || grade.equals("d-") || grade.equals("F") 
        || grade.equals("f")) {
      return true;
    } 
    else {
      return false;
    }
  }
  /**
   * Sets each letter grade or invalid grades equal to their point values.
   * 
   * @param qualityPoints
   *            amount of points the grades are worth.
   * 
   * @return points
   *      how much the grades are worth.
   */
  private double qualityPoints(String qualityPoints) {
    double points;

    switch (qualityPoints) {
    case "A":
    case "a":
      points = 4.00;
      break;
    case "A-":
    case "a-":
      points = 3.70;
      break;
    case "B+":
    case "b+":
      points = 3.30;
      break;
    case "B":
    case "b":
      points = 3.00;
      break;
    case "B-":
    case "b-":
      points = 2.70;
      break;
    case "C+":
    case "c+":
      points = 2.30;
      break;
    case "C":
    case "c":
      points = 2.00;
      break;
    case "C-":
    case "c-":
      points = 1.70;
      break;
    case "D+":
    case "d+":
      points = 1.30;
      break;
    case "D":
    case "d":
      points = 1.00;
      break;
    case "D-":
    case "d-":
      points = 0.7;
      break;
    case "F":
    case "f":
      points = 0;
      break;
    case "I":
    case "i":
      points = -1;
      break;
    case "CR":
    case "cr":
    case "Cr":
    case "cR":
      points = -1;
      break;
    case "NC":
    case "nc":
    case "Nc":
    case "nC":
      points = -1;
      break;
    case "WP":
    case "wp":
    case "Wp":
    case "wP":
      points = -1;
      break;
    case "WF":
    case "wf":
    case "Wf":
    case "wF":
      points = -1;
      break;
    case "W":
    case "w":
      points = -1;
      break;
    default:
      points = -1;
      break;
    }
    return points;
  }
  /**
   * Allows these letters to either be used or known as a bad value.
   * 
   * @param grade
   *            the grades available for the program.
   * 
   * @return true or false
   *      regarding what the input is.
   */
  public boolean isGrade(String grade) {
    boolean value;

    switch (grade) {
    case "A":
    case "a":
      value = true;
      break;
    case "A-":
    case "a-":
      value = true;
      break;
    case "B+":
    case "b+":
      value = true;
      break;
    case "B":
    case "b":
      value = true;
      break;
    case "B-":
    case "b-":
      value = true;
      break;
    case "C+":
    case "c+":
      value = true;
      break;
    case "C":
    case "c":
      value = true;
      break;
    case "C-":
    case "c-":
      value = true;
      break;
    case "D+":
    case "d+":
      value = true;
      break;
    case "D":
    case "d":
      value = true;
      break;
    case "D-":
    case "d-":
      value = true;
      break;
    case "F":
    case "f":
      value = true;
      break;
    case "I":
    case "i":
      value = true;
      break;
    case "CR":
    case "cr":
    case "Cr":
    case "cR":
      value = true;
      break;
    case "NC":
    case "nc":
    case "Nc":
    case "nC":
      value = true;
      break;
    case "WP":
    case "wp":
    case "Wp":
    case "wP":
      value = true;
      break;
    case "WF":
    case "wf":
    case "Wf":
    case "wF":
      value = true;
      break;
    case "W":
    case "w":
      value = true;
      break;
    default:
      value = false;
      break;
    }
    return value;
  }

}