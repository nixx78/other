package lv.nixx.poc.patterns.behavioral.topic.service;

import lv.nixx.poc.patterns.behavioral.topic.MessageWrapper;
import lv.nixx.poc.patterns.behavioral.topic.Subscriber;
import lv.nixx.poc.patterns.behavioral.topic.dto.UIMessageThree;

public class ServiceThree implements Subscriber<UIMessageThree> {

	@Override
	public void send(MessageWrapper<?> message) {
		System.out.println("ServiceThree:" + message.getMessage());
		
	}


}
