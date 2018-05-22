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
      switch (arg) {
        // FIXME - Replace repeated statements with method call.
        case "add":
        case "+":
          add(stack);
          break;
        case "sub":
        case "-":
          subtract(stack);
          break;
        case "mul":
        case "*":
          multiply(stack);
          break;
        case "div":
        case "/":
          divide(stack);
          break;
        case "pow":
        case "exp":
        case "**":
        case "^":
          power(stack);
          break;
        case "mod":
        case "%":
          modulus(stack);
          break;
        case "abs":
        case "-a":
          abs(stack);
          break;
        default:
          stack.push(Double.valueOf(arg));
          break;
      }
    }
    System.out.print("Result = ");
    System.out.printf("%,.2f%n", stack.pop());
  }

  /**
   * @param stack
   */
  private static void add(Stack<Double> stack) {
    double[] values = pop(stack, 2);
    stack.push(values[0] + values[1]);
  }
  
  private static void subtract(Stack<Double> stack) {
    double[] values = pop(stack, 2);
    stack.push(values[0] - values[1]);
  }
  
  private static void multiply(Stack<Double> stack) {
    double[] values = pop(stack, 2);
    stack.push(values[0] * values[1]);
  }
  
  private static void divide(Stack<Double> stack) {
    double[] values = pop(stack, 2);
    stack.push(values[0] / values[1]);
  }
  
  private static void power(Stack<Double> stack) {
    double[] values = pop(stack, 2);
    stack.push(Math.pow(values[0], values[1]));
  }
  
  private static void modulus(Stack<Double> stack) {
    double[] values = pop(stack, 2);
    stack.push(values[0] % values[1]);
  }
  
  private static void abs(Stack<Double> stack) {
    double[] values = pop(stack, 2);
    stack.push(Math.abs(values[0] - values[1]));
  }
  
  private static double[] pop(Stack<Double> stack, int numItems) {
    double[] values = new double[numItems];
    for (int i = 0; i < numItems; i++) {
      values[i] = stack.pop();
    }
    return values;
  }
}
