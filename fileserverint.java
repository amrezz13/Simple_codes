
import java.io.File;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface fileserverint extends Remote{
     public void upload(String filename, byte[] file) throws RemoteException;
	
	
    
}
