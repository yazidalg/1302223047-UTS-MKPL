public class EmployeeDetail {
  private String employeeId;
  private String firstName;
  private String lastName;
  private String idNumber;
  private String address;
  private boolean isForeigner;
  private boolean gender;

  public EmployeeDetail(String employeeId, String firstName, String lastName, String idNumber, String address, boolean isForeigner, boolean) {
    this.employeeId = employeeId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.idNumber = idNumber;
    this.address = address;
    this.isForeigner = isForeigner
  }

  public boolean isForeigner() {
    return isForeigner;
  }
}
