package lv.nixx.poc.core.client1;

import lv.nixx.poc.core.CoreService;

public class CoreServiceClient1 implements CoreService {

	@Override
	public String getCustomResponse() {
		return "client1";
	}

}
