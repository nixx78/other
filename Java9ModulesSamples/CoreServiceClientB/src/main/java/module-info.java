module service.core.clientB {
	requires service.core;
	provides lv.nixx.poc.core.CoreService with lv.nixx.poc.core.client2.CoreServiceClient2;
}