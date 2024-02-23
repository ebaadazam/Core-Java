public class Main {
  static void checkAge(int age) { 
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old."); 
    } else {
      System.out.println("Access granted - You are old enough!"); 
    }
 } 
 
 public static void main(String[] args) { 
   checkAge(17); 
   System.out.println("Restttt"); // this will not get printed only if exception occurs
 } 
}

