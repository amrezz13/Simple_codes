import java.rmi.*;
 
public interface FileServerInt extends Remote{
 
	public void upload(String filename, byte[] file) throws RemoteException;
}
/*
A remote interface provides the description of all the methods of a particular remote object.
 The client communicates with this remote interface.

*/