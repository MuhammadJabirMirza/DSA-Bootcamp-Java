package assignment3;

//8. Calculate Depreciation of Value
public class InterQuestion8 {
    public static void main(String[] args) {
       int actualPrice= 15000;
       int total_life_months=12;

       double depreciation= actualPrice/total_life_months;
       System.out.println("deprication per month would be "+ depreciation);
       double depreciationPercentage= depreciation/actualPrice*100;
       System.out.println("Depreciation percentage would be "+ depreciationPercentage);

    }

}
