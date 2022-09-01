package fact;

public class PlanInput {

	Plan getPlan(String name)
	{
	if(name==null)
	{
		return null;
	}
	if(name.equalsIgnoreCase("Domestic"))
		return new DomesticPlan();
	else if(name.equalsIgnoreCase("Commerial"))
		return new CommerialPlan();
	else if(name.equalsIgnoreCase("Intstitutional"))
		return new IntstitutionalPlan();
	
	return null;
	}
}
