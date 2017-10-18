package lv.nixx.poc.client;

import java.util.ServiceLoader;

import lv.nixx.poc.core.CoreService;

public class Runner {
	
	public static void main(String[] args) {
		ServiceLoader<CoreService> s = ServiceLoader.load(CoreService.class);
		for (CoreService coreService : s) {
			System.out.println(coreService.processRequest("request"));
		}
	}
}
