package lv.nixx.poc.patterns.behavioral.topic;

import lombok.Getter;
import lv.nixx.poc.patterns.behavioral.topic.dto.UIMessage;

@Getter
public class MessageWrapper<T extends UIMessage> {
	
	private final T message;
	public MessageWrapper(T message) {
		this.message = message;
	}

}
