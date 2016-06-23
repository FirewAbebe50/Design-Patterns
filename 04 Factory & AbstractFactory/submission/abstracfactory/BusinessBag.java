package cs525.labs.abstracfactory;

public class BusinessBag extends AbstractBag{

	@Override
	public String getPackagingInfo() {
		return "Packaging Instruction: Merchant Collection to pack the gift";
	}

	@Override
	public double getPackagingCost() {
		return 0.50;
	}

}
