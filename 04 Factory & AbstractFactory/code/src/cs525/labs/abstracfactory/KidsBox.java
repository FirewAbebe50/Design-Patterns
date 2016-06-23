package cs525.labs.abstracfactory;

public class KidsBox extends AbstractBox {

	@Override
	public String getPackagingInfo() {
		return "Packaging Instruction: Cartoon to pack the gift";
	}

	@Override
	public double getPackagingCost() {
		return 0.50;
	}

}
