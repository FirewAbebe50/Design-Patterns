package cs525.labs.abstracfactory;

public class AdultBag extends AbstractBag{

	@Override
	public String getPackagingInfo() {
		return "Packaging Instruction: Reusable Shopper to pack the gift";
	}

	@Override
	public double getPackagingCost() {
		return 0.00;
	}

}
