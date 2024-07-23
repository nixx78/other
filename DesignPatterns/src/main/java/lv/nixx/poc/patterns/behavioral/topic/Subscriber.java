package lv.nixx.poc.patterns.behavioral.topic;


import lv.nixx.poc.patterns.behavioral.topic.dto.UIMessage;

public interface Subscriber<T extends UIMessage> {
	
	void send(MessageWrapper<?> message);

}
