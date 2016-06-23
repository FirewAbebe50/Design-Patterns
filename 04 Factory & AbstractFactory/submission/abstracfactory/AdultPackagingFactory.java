package cs525.labs.abstracfactory;

public class AdultPackagingFactory implements PackagingFactory {

	@Override
	public AbstractBag createBag() {
		return new AdultBag();
	}

	@Override
	public AbstractBox createBox() {
		return new AdultBox();
	}

	@Override
	public AbstractWrap createWrap() {
		return new AdultWrap();
	}

}
