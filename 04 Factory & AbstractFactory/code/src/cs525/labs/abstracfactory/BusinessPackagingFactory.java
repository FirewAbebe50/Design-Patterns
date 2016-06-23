package cs525.labs.abstracfactory;

public class BusinessPackagingFactory implements PackagingFactory {

	@Override
	public AbstractBag createBag() {
		return new BusinessBag();
	}

	@Override
	public AbstractBox createBox() {
		return new BusinessBox();
	}

	@Override
	public AbstractWrap createWrap() {
		return new BusinessWrap();
	}

}
