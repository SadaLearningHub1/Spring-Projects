package service;

import javax.ejb.Remote;

@Remote
public interface DemoInter{
	String sayHello(String uname);

}
