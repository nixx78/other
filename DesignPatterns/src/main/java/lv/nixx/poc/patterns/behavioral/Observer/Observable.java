package lv.nixx.poc.patterns.behavioral.Observer;

public interface Observable {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}