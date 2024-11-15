package intellij.bugs;

public class ReuseParameterObject {
  public static void main(String[] args) {
    method("John", "Doe");
  }
  // click on method name > Refactor > Introduce Parameter Object
  // > Use existing class > intellij.bugs.FullName (is a record!!)

  // Actual method resulting body:
  //     System.out.println("first: " + fullName.getFirstName()); // compilation error
  //     System.out.println("last: " + fullName.lastName());
  public static void method(String firstName, String lastName) {
    System.out.println("first: " + firstName);
    System.out.println("last: " + lastName);
  }
}

record FullName(String firstName, String lastName) {
}