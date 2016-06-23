package cs525.labs.abstracfactory;

public class KidsPackagingFactory implements PackagingFactory {

	@Override
	public AbstractBag createBag() {
		return new KidsBag();
	}

	@Override
	public AbstractBox createBox() {
		return new KidsBox();
	}

	@Override
	public AbstractWrap createWrap() {
		return new KidsWrap();
	}

}
