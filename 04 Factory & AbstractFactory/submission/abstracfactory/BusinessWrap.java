package cs525.labs.abstracfactory;

public class BusinessWrap extends AbstractWrap {

	@Override
	public String getPackagingInfo() {
		return "Packaging Instruction: Holiday Surprise to pack the gift";
	}

	@Override
	public double getPackagingCost() {
		return 0.25;
	}

}
