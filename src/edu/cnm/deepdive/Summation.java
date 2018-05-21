package edu.cnm.deepdive;

/**
 * This is the class containing the main entry point for the RPN calculator.
 * 
 * @author spy
 * @version 0.1.0
 */
public class Summation {
  /**
   * Command-line entry point for RPN interpreter.
   * 
   * @param args
   */
  public static void main(String[] args) {
    int sum = 0;
    String output = "";
    // for (int i = 0; i < args.length-1; i++) {
    // int val = Integer.parseInt(args[i]);
    // output += args[i] + " + ";
    // sum += val;
    // }
    int i = 0;
    while (i < args.length - 1) {
      args[i] = args[i].trim();
      int val = Integer.parseInt(args[i]);
      output += args[i] + " + ";
      sum += val;
      i++;
    }
    args[args.length - 1] = args[args.length - 1].trim();
    int val = Integer.parseInt(args[args.length - 1]);
    sum += val;
    output += args[args.length - 1] + " = " + Integer.toString(sum);
    System.out.println(output);
  }
}
