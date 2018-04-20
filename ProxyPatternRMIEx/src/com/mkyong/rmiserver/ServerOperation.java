package com.mkyong.rmiserver;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.mkyong.rmiinterface.RMIInterface;


// Class extends UnicastRemoteObject as that super class will take care of remoting
public class ServerOperation extends UnicastRemoteObject implements RMIInterface{
	private static final long serialVersionUID = 1L;
  
	// constructor need to throw Remote Exception as its super class throws error too
	protected ServerOperation() throws RemoteException {
		super();
	}
   
	// methods need to throw Remote Exceptions to hand;e rmi errors
	@Override
	public String helloTo(String name) throws RemoteException{
		System.err.println(name + " is trying to contact!");
		return "Server says hello to " + name;
	}
	
	public static void main(String[] args){
		try {
			Naming.rebind("//127.0.0.1/MyServer", new ServerOperation());        // register service with rmi registry but rmi puts stub of this in registry which will act as proxy    
            System.err.println("Server ready");
            
        } catch (Exception e) {
        	System.err.println("Server exception: " + e.toString());
          e.printStackTrace();
        }
	}
}
