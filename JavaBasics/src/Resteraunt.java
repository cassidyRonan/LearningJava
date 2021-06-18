public class Resteraunt {

    public static void main(String[] args){

        final double partySize = 5;
        double groupTotalMealPrice = CalculateMealTotal(23.0,.20,.21);
        System.out.println("Total: " + groupTotalMealPrice);


        double individualMealPrice = groupTotalMealPrice / partySize;
        System.out.println("Individual Price: " + individualMealPrice);
    }

    public static double CalculateMealTotal(double mealCost,double tipRate, double taxRate)
    {
        double tip = tipRate * mealCost;
        double tax = taxRate * mealCost;
        double result = mealCost + tip + tax;

        return result;
    }
}
