public class SalaryCalculator {

    public static void main(String[] args)
    {
        double wages = CalculateEmployeeSalary(40,15,2);
        System.out.println(wages);
    }

    public static double CalculateEmployeeSalary(double hoursPerWeek, double hourlyRate, int vacationDays)
    {
        //Error checking
        if(hoursPerWeek < 0 || hourlyRate < 0)
        { return -1; }

        //Calculations
        double weeklyWages = hoursPerWeek * hourlyRate;
        double salary = weeklyWages * 52; //Because 52 weeks in a year
        double finalAmount = salary - (vacationDays * 8 * hourlyRate); //8 hours in a work day is assumption

        return  finalAmount;
    }
}
