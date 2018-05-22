package edu.cnm.deepdive;

import java.util.Stack;
import java.lang.Math;

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
    Stack<Double> stack = new Stack<>();
    for (int i = 0; i < args.length; i++) {
      String arg = args[i].trim().toLowerCase();
      double val1;
      double val2;
      switch (arg) {
        // FIXME - Replace repeated statements with method call.
        case "add":
        case "+":
          val1 = stack.pop();
          val2 = stack.pop();
          stack.push(val1 + val2);
          break;
        case "sub":
        case "-":
          val1 = stack.pop();
          val2 = stack.pop();
          stack.push(val1 - val2);
          break;
        case "mul":
        case "*":
          val1 = stack.pop();
          val2 = stack.pop();
          stack.push(val1 * val2);
          break;
        case "div":
        case "/":
          val1 = stack.pop();
          val2 = stack.pop();
          stack.push(val1 / val2);
          break;
        case "mod":
        case "%":
          val1 = stack.pop();
          val2 = stack.pop();
          stack.push(val1 % val2);
          break;
        case "pow":
        case "exp":
        case "**":
        case "^":
          val1 = stack.pop();
          val2 = stack.pop();
          stack.push(Math.pow(val1, val2));
          break;
        case "-a":
          val1 = stack.pop();
          val2 = stack.pop();
          stack.push(Math.abs(val1 - val2));
          break;
        default:
          double val = Double.parseDouble(arg);
          stack.push(val);
          break;
      }
      /*if (arg.equals("+")) {
        double val1 = stack.pop();
        double val2 = stack.pop();
        stack.push(val1 + val2);
      } else if (arg.equals("-")) {
        double val1 = stack.pop();
        double val2 = stack.pop();
        stack.push(val1 - val2);
      } else if (arg.equals("*")) {
        double val1 = stack.pop();
        double val2 = stack.pop();
        stack.push(val1 * val2);
      } else {
        double val = Double.parseDouble(arg);
        stack.push(val);
      }*/
    }
    System.out.print("Result = ");
    System.out.printf("%,.2f%n", stack.pop());
  }
}
