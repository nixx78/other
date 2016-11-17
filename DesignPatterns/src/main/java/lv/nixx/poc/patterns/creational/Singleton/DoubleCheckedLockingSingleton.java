package lv.nixx.poc.patterns.creational.Singleton;

public final class DoubleCheckedLockingSingleton {
	
	private static volatile DoubleCheckedLockingSingleton singleton;
	
	private DoubleCheckedLockingSingleton(){}
	
	public static DoubleCheckedLockingSingleton getInstance() {
		DoubleCheckedLockingSingleton localInstance = singleton;
		if (localInstance == null) {
			synchronized (DoubleCheckedLockingSingleton.class) {
				localInstance = singleton;
				if (localInstance == null) {
					localInstance = singleton = new DoubleCheckedLockingSingleton();
				}
			}
		}
		return localInstance;
	}

}
