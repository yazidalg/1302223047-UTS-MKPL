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

  public String getEmployeeId() {
    return employeeId;
  }

  public String getFullName() {
    return firstName + " " + lastName;
  }

  public String getIdNumber() {
    return idNumber;
  }

  public String getAddress() {
    return address;
  }

  public boolean isGender() {
    return gender;
  }

  public String genderInfo() {
    if (this.gender == true) {
      return "Laki-laki";
    } else {
      return "Perempuan";
    }
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setIsForeigner(boolean isForeigner) {
    this.isForeigner = isForeigner;
  }

  public void setIsGender(boolean gender) {
    this.gender = gender;
  }
}
