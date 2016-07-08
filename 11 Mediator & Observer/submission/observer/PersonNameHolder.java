package cs525.labs.observer;

import java.util.ArrayList;
import java.util.List;

public class PersonNameHolder implements Subject {

	private List<Observer> observers;
	private List<String> names;
	private final Object MUTEX = new Object();

	public PersonNameHolder() {
		observers = new ArrayList<>();
		names = new ArrayList<>();
	}

	@Override
	public void attach(Observer observer) {
		synchronized (MUTEX) {
			if (!observers.contains(observer))
				observers.add(observer);
		}

	}

	@Override
	public void detach(Observer observer) {
		synchronized (MUTEX) {
			int i = observers.indexOf(observer);
			if (i >= 0)
				observers.remove(i);
		}

	}

	@Override
	public void notifyObservers() {
		synchronized (MUTEX) {
			for (int i = 0; i < observers.size(); i++) {
				observers.get(i).update(names);
			}
		}

	}

	private void sendUpdatedList() {
		notifyObservers();
	}

	@Override
	public void addName(String name) {
		names.add(name);
		sendUpdatedList();
	}

	@Override
	public void removeName(String name) {
		names.remove(name);
		sendUpdatedList();
	}

}
