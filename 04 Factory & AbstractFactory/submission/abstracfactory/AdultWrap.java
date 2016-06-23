package cs525.labs.abstracfactory;

public class AdultWrap extends AbstractWrap{

	@Override
	public String getPackagingInfo() {
		return "Packaging Instruction: Everyday Value to pack the gift";
	}

	@Override
	public double getPackagingCost() {
		return 0.00;
	}

}
