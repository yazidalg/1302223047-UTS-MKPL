public EmployeeFamily {
  private String spouseName;
  private String spouseIdNumber;
  private List<String> childNames = new LinkedList<String>();
  private List<String> childIdNumbers = new LinkedList<String>();

  public EmployeeFamily(String spouseName, String spouseIdNumber) {
    this.spouseName = spouseName;
    this.spouseIdNumber = spouseIdNumber;
  }

  public String getSpouseName() {
    return spouseName;
  }

  public String getSpouseIdNumber() {
    return spouseIdNumber;
  }

  public boolean hasNoSpouse() {
    return spouseName == null || spouseName.isEmpty();
  }

  public int getChildCount() {
    return childNames.size();
  }

  public void addChild(String childName, String childIdNumber) {
    childNames.add(childName);
    childIdNumbers.add(childIdNumber);
  }

  public void setSpouse(String spouseName, String spouseIdNumber) {
		this.spouseName = spouseName;
		this.spouseIdNumber = idNumber;
	}
}