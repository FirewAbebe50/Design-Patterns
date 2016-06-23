package cs525.labs.abstracfactory;

public class AdultBox extends AbstractBox{

	@Override
	public String getPackagingInfo() {
		return "Packaging Instruction: Plain Paper to pack the gift";
	}

	@Override
	public double getPackagingCost() {
		return 0.25;
	}

}
