package lv.nixx.poc.patterns.behavioral.topic.service;

import lv.nixx.poc.patterns.behavioral.topic.MessageWrapper;
import lv.nixx.poc.patterns.behavioral.topic.Subscriber;
import lv.nixx.poc.patterns.behavioral.topic.dto.UIMessageOne;

public class ServiceOne implements Subscriber<UIMessageOne> {

	@Override
	public void send(MessageWrapper<?> message) {
		System.out.println("ServiceOne:" + message.getMessage());
	}

}
