import java.rmi.Remote;
import java.rmi.RemoteException;

 
public interface FileClientInt extends Remote{
 
	public boolean sendData(String filename, byte[] data, int len) throws RemoteException;
	
	public String getName() throws RemoteException;
}
/*
A remote interface provides the description of all the methods of a particular remote object.
 The client communicates with this remote interface.

*/
