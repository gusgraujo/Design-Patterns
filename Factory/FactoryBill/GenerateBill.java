package Factory.FactoryBill;


import Factory.FactoryBill.factories.GetPlanFactory;
import Factory.FactoryBill.plan.Plan;

public class GenerateBill {

    public static void main(String[] args) {
        GetPlanFactory planFactory = new GetPlanFactory();

        String planName = "COMMERCIAL";
        int units = 5;
        Plan p = planFactory.getPlan(planName);


        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        p.getRate();
        p.calculateBill(units);
    }
}
