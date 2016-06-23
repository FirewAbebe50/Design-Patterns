package cs525.labs.abstracfactory;

public interface PackagingFactory {

	AbstractBag createBag();

	AbstractBox createBox();

	AbstractWrap createWrap();
}
