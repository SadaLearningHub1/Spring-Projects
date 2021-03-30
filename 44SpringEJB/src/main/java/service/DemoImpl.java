package service;

import javax.ejb.Stateless;

@Stateless
public class DemoImpl implements DemoInter{

	@Override
	public String sayHello(String uname) {
		return "Hello  " +uname;
	}

}
