package cs525.labs.observer;

public interface Subject {

	void attach(Observer observer);

	void detach(Observer observer);

	void notifyObservers();

	void addName(String name);

	void removeName(String name);
}
