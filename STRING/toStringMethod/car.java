public class car {

  int noOfWheels;

  int noOfDoors;

  int maxSpeed;

  String name;

  String modelNumber;

  String company;

  public car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {

    this.noOfWheels = noOfWheels;
    this.noOfDoors = noOfDoors;
    this.maxSpeed = maxSpeed;
    this.name = name;
    this.modelNumber = modelNumber;
    this.company = company;
  }

  /*
   * Normal WAY
   * 
   * @Override
   * public String toString() {
   * // TODO Auto-generated method stub
   * return "car{" +
   * " noOfWheels = " + noOfWheels +
   * ", noOfDoors = " + noOfDoors +
   * ", maxSpeed = " + maxSpeed +
   * ", name = '" + name + '\'' +
   * ", modelNumber = '" + modelNumber + '\'' +
   * ", company = '" + company + '\'' +
   * " }";
   * 
   * }
   */

  // ? By using String Builder

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Car{");

    sb.append("noOfWheels = ").append(noOfWheels);
    sb.append(", noOfDoors = ").append(noOfDoors);
    sb.append(", maxSpeed = ").append(maxSpeed);
    sb.append(", name = '").append(maxSpeed).append('\'');
    sb.append(", modelNumber = '").append(modelNumber).append('\'');
    sb.append(", company = '").append(company).append('\'');
    sb.append('}');

    return sb.toString();
  }

  public static void main(String[] args) {
    car swift = new car(4, 4, 122, "Swift", "SW9090", "Maruti");

    System.out.println(swift.toString());
  }

}