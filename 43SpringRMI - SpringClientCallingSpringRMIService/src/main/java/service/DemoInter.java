package service;
import java.rmi.Remote;
import java.rmi.RemoteException;



public interface DemoInter extends Remote{
	String sayHello(String uName) throws RemoteException;

}
