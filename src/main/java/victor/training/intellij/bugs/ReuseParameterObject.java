package victor.training.intellij.bugs;

public class ReuseParameterObject {
  public static void main(String[] args) {
    otherMethod("John", "Doe");
  }
  public static void otherMethod(String firstName, String lastName) {
    System.out.println("first: " + firstName);
    System.out.println("last: " + lastName);
  }
}

record FullName(String firstName, String lastName) {
}