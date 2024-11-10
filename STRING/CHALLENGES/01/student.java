// ! Define a Student class with fields like name and age, and use toString to print student details.

public class student {
  String name;
  int age;
  String rollNumber;
  String house;

  public student(String name, int age, String rollNumber, String house) {
    this.name = name;
    this.age = age;
    this.rollNumber = rollNumber;
    this.house = house;
  }

  @Override

  public String toString() {
    return "Student Details : { name: " + name + ", age: " + age + ",  rollNumber: " + rollNumber + ", house: " + house
        + " }";
  }

  public static void main(String[] args) {
    student stu = new student("Abhishek", 23, "41", "LEO");

    System.out.println(stu);
  }
}
