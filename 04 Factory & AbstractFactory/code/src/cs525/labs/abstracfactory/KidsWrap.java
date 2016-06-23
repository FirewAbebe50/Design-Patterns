package cs525.labs.abstracfactory;

public class KidsWrap extends AbstractWrap {

	@Override
	public String getPackagingInfo() {
		return "Packaging Instruction: Happy Kid to pack the gift";
	}

	@Override
	public double getPackagingCost() {
		return 0.10;
	}

}
