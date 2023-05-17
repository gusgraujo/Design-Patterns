package Factory.FactoryBill.factories;

import Factory.FactoryBill.plan.CommercialPlan;
import Factory.FactoryBill.plan.DomesticPlan;
import Factory.FactoryBill.plan.InstitutionalPlan;
import Factory.FactoryBill.plan.Plan;

public class GetPlanFactory {

    public Plan getPlan(String planType){
        if (planType == null){
            return null;
        }
        else if (planType.equals("COMMERCIAL")){
            return new CommercialPlan();
        }
        else if (planType.equals("DOMESTIC")){
            return new DomesticPlan();
        }
        else if (planType.equals("INSTITUTIONAL")){
            return new InstitutionalPlan();
        }
        return null;
    }

}
