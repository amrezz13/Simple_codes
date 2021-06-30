import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;
 
public class FileClient  extends UnicastRemoteObject implements FileClientInt {

    /*
    The UnicastRemoteObject class defines a non-replicated remote object whose references are valid only while the server process is alive.
    The UnicastRemoteObject class provides support for point-to-point active object references (invocations, parameters, 
    and results) 
    using TCP streams.

    Used for exporting a remote object with JRMP and obtaining a stub that communicates to the remote object.
    Stubs are either generated at runtime using dynamic proxy objects,
    or they are generated statically at build time, typically using the rmic tool.

    */
	
	private static final long serialVersionUID = 1L;
	public String name;
	public  FileClient(String n) throws RemoteException {
		super();
		name=n;
	}
 
	public String getName() throws RemoteException{
		return name;
	}
    
	public boolean sendData(String filename, byte[] data, int len) throws RemoteException{
        try{
        	File f=new File(filename);
        	f.createNewFile();
        	FileOutputStream out=new FileOutputStream(f,true);
        	out.write(data,0,len);
        	out.flush();
        	out.close();
        	System.out.println("Done writing data...");
        }catch(Exception e){
        	e.printStackTrace();
        }
		return true;
	}
}