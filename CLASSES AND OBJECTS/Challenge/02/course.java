
public class course {

  static int maxCapacity;
  String courseName;
  int enrolled;

  course(String courseName) {
    this.courseName = courseName;
    this.enrolled = 0;
    this.enrolledStudents = new String[maxCapacity];
  }

  String[] enrolledStudents = new String[maxCapacity];

  static void setMaxCapacity(int maxCapacity) {
    course.maxCapacity = maxCapacity;
  }

  course(String courseName, int enrolled) {
    this.courseName = courseName;
    this.enrolled = enrolled;
  }

  void enrollStudents(String studentName) {
    enrolledStudents[enrolled] = studentName;
    enrolled++;

  }

  void unenrolledStudents(String studentName) {
    enrolledStudents[enrolled] = null;
    enrolled--;
  }

}
