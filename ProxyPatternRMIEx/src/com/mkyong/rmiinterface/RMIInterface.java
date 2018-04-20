package com.mkyong.rmiinterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

// interface extends Remote Object to act as stub at client side and also make call to server
public interface RMIInterface extends Remote {
	// method signature need to throw remote exception when remote call is made
	// input as well as output should be serializable or primitives
	public String helloTo(String name) throws RemoteException;
}