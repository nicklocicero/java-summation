package edu.cnm.deepdive;

public class Summation {

  public static void main(String[] args) {
//    for (int i = 1; i < args.length; i = i + 2) {
//      System.out.println(args[i]);
//      System.out.println(args[i-1]);
//    }
//    for (String s: args){
//      System.out.println(s);
//    }
//    int a = -2;
//    for (;a<0;a++) {
//      System.out.println("Works?");
//    }
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
