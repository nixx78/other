package lv.nixx.poc.core.client2;

import lv.nixx.poc.core.CoreService;

public class CoreServiceClient2 implements CoreService {
	
	@Override
	public String getCustomResponse() {
		return "client2";
	}

}
