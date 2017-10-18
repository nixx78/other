package lv.nixx.poc.core;

public interface CoreService {
	
	String getCustomResponse();

	public default String processRequest(String in) {
		return in + ":" + getCustomResponse();
	}
	
}
