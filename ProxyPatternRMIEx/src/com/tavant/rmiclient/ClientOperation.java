package com.tavant.rmiclient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import com.tavant.rmiinterface.RMIInterface;

public class ClientOperation {
	private static RMIInterface look_up;// acts as client stub 

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		
		look_up = (RMIInterface) Naming.lookup("//127.0.0.1/MyServer");
		String txt = JOptionPane.showInputDialog("What is your name?");
			
		String response = look_up.helloTo(txt); // makes call to server to get the response
		JOptionPane.showMessageDialog(null, response);
	}
}
