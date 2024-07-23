package lv.nixx.poc.patterns.behavioral.topic;

import lv.nixx.poc.patterns.behavioral.topic.dto.UIMessage;
import lv.nixx.poc.patterns.behavioral.topic.dto.UIMessageOne;
import lv.nixx.poc.patterns.behavioral.topic.dto.UIMessageThree;
import lv.nixx.poc.patterns.behavioral.topic.dto.UIMessageTwo;
import lv.nixx.poc.patterns.behavioral.topic.service.ServiceOne;
import lv.nixx.poc.patterns.behavioral.topic.service.ServiceThree;
import lv.nixx.poc.patterns.behavioral.topic.service.ServiceTwo;

import java.util.HashMap;
import java.util.Map;

public class NotificationManager {
	
	private final Map<Class<? extends UIMessage>, Subscriber<?>> notifications = new HashMap<>();
	
	public NotificationManager() {
		notifications.put(UIMessageOne.class, new ServiceOne());
		notifications.put(UIMessageTwo.class, new ServiceTwo());
		notifications.put(UIMessageThree.class, new ServiceThree());
	}

	public void notifyAbout(UIMessage message) {
		MessageWrapper<UIMessage> mw = new MessageWrapper<>(message);
		notifications.get(message.getClass()).send(mw);
	}

}

