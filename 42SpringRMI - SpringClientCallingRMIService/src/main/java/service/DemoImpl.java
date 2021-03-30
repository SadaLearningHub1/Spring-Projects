package service;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DemoImpl extends UnicastRemoteObject implements DemoInter{

	protected DemoImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayHello(String uname) {
		// TODO Auto-generated method stub
		return "Hello" +uname;
	}
	public static void main(String[] args) {
		try {
			DemoImpl di = new DemoImpl();
			Naming.bind("one",  di);
			System.out.println("RMI Service is Registered Successfully");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
