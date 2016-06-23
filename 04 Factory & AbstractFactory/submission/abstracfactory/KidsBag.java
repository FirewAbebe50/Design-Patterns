package cs525.labs.abstracfactory;

public class KidsBag extends AbstractBag{

	@Override
	public String getPackagingInfo() {
		return "Packaging Instruction: Micky to pack the gift";
	}

	@Override
	public double getPackagingCost() {
		return 0.25;
	}

}
