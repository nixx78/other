module service.core.clientA {
	requires service.core;
	provides lv.nixx.poc.core.CoreService with lv.nixx.poc.core.client1.CoreServiceClient1;
}