package lv.nixx.poc.patterns.behavioral.topic.dto;

public class UIMessageTwo implements UIMessage {
	
	private final String message;

	public UIMessageTwo(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "DtoTwo [message=" + message + "]";
	}
	
}
