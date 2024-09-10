import org.junit.Test;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutomatedTests {

  // Begin return tests
  @Test
  public void calc1000MetersTo1Kilometer() {
    double meters = 1000;
    double expectedAnswer = meters * 0.001;

    ConversionProgram conversionProgram = new ConversionProgram();
    double actualAnswer = conversionProgram.calcKilometers(meters);

    assertEquals(expectedAnswer, actualAnswer, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calc500MetersToKilometers() {
    double meters = 500;
    double expectedAnswer = meters * 0.001;

    ConversionProgram conversionProgram = new ConversionProgram();
    double actualAnswer = conversionProgram.calcKilometers(meters);

    assertEquals(expectedAnswer, actualAnswer, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calc99999MetersToKilometers() {
    double meters = 99999;
    double expectedAnswer = meters * 0.001;

    ConversionProgram conversionProgram = new ConversionProgram();
    double actualAnswer = conversionProgram.calcKilometers(meters);

    assertEquals(expectedAnswer, actualAnswer, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calc400MetersToInches() {
    double meters = 400;
    double expectedAnswer = meters * 39.37;

    ConversionProgram conversionProgram = new ConversionProgram();
    double actualAnswer = conversionProgram.calcInches(meters);

    assertEquals(expectedAnswer, actualAnswer, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calc10MetersToInches() {
    double meters = 10;
    double expectedAnswer = meters * 39.37;

    ConversionProgram conversionProgram = new ConversionProgram();
    double actualAnswer = conversionProgram.calcInches(meters);

    assertEquals(expectedAnswer, actualAnswer, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calc10000MetersToInches() {
    double meters = 10000;
    double expectedAnswer = meters * 39.37;

    ConversionProgram conversionProgram = new ConversionProgram();
    double actualAnswer = conversionProgram.calcInches(meters);

    assertEquals(expectedAnswer, actualAnswer, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calc10000MetersToFeet() {
    double meters = 10000;
    double expectedAnswer = meters * 3.281;

    ConversionProgram conversionProgram = new ConversionProgram();
    double actualAnswer = conversionProgram.calcFeet(meters);

    assertEquals(expectedAnswer, actualAnswer, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calc54321MetersToFeet() {
    double meters = 54321;
    double expectedAnswer = meters * 3.281;

    ConversionProgram conversionProgram = new ConversionProgram();
    double actualAnswer = conversionProgram.calcFeet(meters);

    assertEquals(expectedAnswer, actualAnswer, 0.01); // 0.01 is the delta for double comparison precision
  }
  @Test
  public void calc8675309MetersToFeet() {
    double meters = 8675309;
    double expectedAnswer = meters * 3.281;

    ConversionProgram conversionProgram = new ConversionProgram();
    double actualAnswer = conversionProgram.calcFeet(meters);

    assertEquals(expectedAnswer, actualAnswer, 0.01); // 0.01 is the delta for double comparison precision
  }
  public void calcPiMetersToFeet() {
    double meters = 3.1415926;
    double expectedAnswer = meters * 3.281;

    ConversionProgram conversionProgram = new ConversionProgram();
    double actualAnswer = conversionProgram.calcFeet(meters);

    assertEquals(expectedAnswer, actualAnswer, 0.01); // 0.01 is the delta for double comparison precision
  }

  @Test
  public void checkForExit() throws IOException {
    // Make sure that your file path is correct
    BufferedReader br = new BufferedReader(new FileReader("ConversionProgram.java")); 
    String line;
    boolean flag = false;

    // This checks for forbidden words or verifies that words are present.
    while ((line = br.readLine()) != null) {
      if (line.contains("System.exit(") || line.contains("System.exit (")) {
        flag = true;
      }
    }
    if (flag == false) {
      fail("You forgot to close the program.");
    }
  } 

  @Test
  public void checkForMenu() throws IOException {
    // Make sure that your file path is correct
    BufferedReader br = new BufferedReader(new FileReader("ConversionProgram.java")); 
    String line;
    boolean flag = false;

    // This checks for forbidden words or verifies that words are present.
    while ((line = br.readLine()) != null) {
      if (line.contains("menu (") || line.contains("menu(")) {
        flag = true;
      }
    }
    if (flag == false) {
      fail("You need to create and call a method called 'menu.' The autograder was unable to find it.");
    }
  }
  @Test
  public void checkForLoop() throws IOException {
    // Make sure that your file path is correct
    BufferedReader br = new BufferedReader(new FileReader("ConversionProgram.java")); 
    String line;
    boolean flag = false;

    // This checks for forbidden words or verifies that words are present.
    while ((line = br.readLine()) != null) {
      if (line.contains("while(") || line.contains("while (")) {
        flag = true;
      }
    }
    if (flag == false) {
      fail("You need to use a while or do while loop to complete this program. The autograder was unable to find it.");
    }
  }  

}
