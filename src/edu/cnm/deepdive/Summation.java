package edu.cnm.deepdive;

public class Summation {

  public static void main(String[] args) {
    int sum = 0;
    String output = "";
    for (int i = 0; i < args.length-1; i++) {
      int val = Integer.parseInt(args[i]);
      output += args[i] + " + ";
      sum += val;
    }
    int val = Integer.parseInt(args[args.length-1]);
    sum += val;
    output += args[args.length-1] + " = " + Integer.toString(sum);
    System.out.println(output);
  }
}
