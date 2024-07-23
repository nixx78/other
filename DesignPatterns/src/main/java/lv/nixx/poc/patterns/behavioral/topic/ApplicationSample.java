package lv.nixx.poc.patterns.behavioral.topic;

import lv.nixx.poc.patterns.behavioral.topic.dto.UIMessageOne;
import lv.nixx.poc.patterns.behavioral.topic.dto.UIMessageThree;
import lv.nixx.poc.patterns.behavioral.topic.dto.UIMessageTwo;

public class ApplicationSample {
	
	public static void main(String[] args) {
		NotificationManager manager = new NotificationManager();

		manager.notifyAbout(new UIMessageOne("message.value1"));
		manager.notifyAbout(new UIMessageTwo("message.value2"));
		manager.notifyAbout(new UIMessageThree("message.value3"));
	}

}
