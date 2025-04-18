public class EmployeeSalary {
	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;
  EmployeeDetail employeeDetail;

	public EmployeeSalary(EmployeeDetail employeeDetail, int monthlySalary, int otherMonthlyIncome, int annualDeductible) {
		this.monthlySalary = monthlySalary;
		this.otherMonthlyIncome = otherMonthlyIncome;
		this.annualDeductible = annualDeductible;
	}

	public int setMonthlySalary(int grade) {
    int baseSalary;
    switch (grade) {
        case 1 -> baseSalary = 3_000_000;
        case 2 -> baseSalary = 5_000_000;
        case 3 -> baseSalary = 7_000_000;
        default -> throw new IllegalArgumentException("Invalid grade: " + grade);
    }

    if (isForeigner) {
      return (int) (baseSalary * 1.5)
    }

    return baseSalary;
	}

  public int calculateWorkingMonths() {
    LocalDate now = LocalDate.now();
    return now.getYear() == yearJoined ? now.getMonthValue() - monthJoined : 12;
  }


  public int getMonthlySalary() {
    return monthlySalary;
  }

  public int getOtherMonthlyIncome() {
    return otherMonthlyIncome;
  }

  public int getAnnualDeductible() {
    return annualDeductible;
  }

	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}
	
}