package cs525.labs.abstracfactory;

public class BusinessBox extends AbstractBox {

	@Override
	public String getPackagingInfo() {
		return "Packaging Instruction: Hard Plastic to pack the gift";
	}

	@Override
	public double getPackagingCost() {
		return 1.00;
	}

}
