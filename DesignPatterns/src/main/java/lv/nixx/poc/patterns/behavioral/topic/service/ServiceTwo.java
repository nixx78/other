package lv.nixx.poc.patterns.behavioral.topic.service;


import lv.nixx.poc.patterns.behavioral.topic.MessageWrapper;
import lv.nixx.poc.patterns.behavioral.topic.Subscriber;
import lv.nixx.poc.patterns.behavioral.topic.dto.UIMessageTwo;

public class ServiceTwo implements Subscriber<UIMessageTwo> {

	@Override
	public void send(MessageWrapper<?> message) {
		System.out.println("ServiceTwo:" + message.getMessage());
	}

}
