package lib;

public class TaxFunction {

    private static final int BASIC_NON_TAXABLE_INCOME = 54_000_000;
    private static final int MARRIED_ADDITION = 4_500_000;
    private static final int CHILD_ADDITION_PER_CHILD = 1_500_000;
    private static final int MAX_CHILDREN_COUNTED = 3;
    private static final double TAX_RATE = 0.05;

    public static int calculateTax(
            int monthlySalary,
            int otherMonthlyIncome,
            int monthsWorked,
            int deductible,
            boolean isSingle,
            int numberOfChildrens
    ) {
        if (monthsWorked > 12) {
            System.err.println("PERINGATAN: bulan kerja melebihi 12 bulan dalam sehatun, batas hanya 12 bulan saja.");
            monthsWorked = 12;
        }

        numberOfChildrens = Math.min(numberOfChildrens, MAX_CHILDREN_COUNTED);

        int grossAnnualIncome = (monthlySalary + otherMonthlyIncome) * monthsWorked;
        int nonTaxableIncome = BASIC_NON_TAXABLE_INCOME;

        if (!isSingle) {
            nonTaxableIncome += MARRIED_ADDITION + (numberOfChildrens * CHILD_ADDITION_PER_CHILD);
        }

        int taxableIncome = grossAnnualIncome - deductible - nonTaxableIncome;
        int tax = (int) Math.round(TAX_RATE * Math.max(taxableIncome, 0));

        return tax;
    }
}
