package lv.nixx.poc.patterns.behavioral.topic.dto;

public class UIMessageOne implements UIMessage {
	
	private final String message;

	public UIMessageOne(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "DtoOne [message=" + message + "]";
	}
	
}
