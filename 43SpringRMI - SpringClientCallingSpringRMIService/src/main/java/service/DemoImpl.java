package service;

public class DemoImpl implements DemoInter{

	@Override
	public String sayHello(String uname) {
		return "Hello  " +uname;
	}

}
