
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class fileserver extends UnicastRemoteObject implements fileserverint {
    
	  /*
    The UnicastRemoteObject class defines a non-replicated remote object whose references are valid only while the server process is alive.
    The UnicastRemoteObject class provides support for point-to-point active object references (invocations, parameters, 
    and results) 
    using TCP streams.

    Used for exporting a remote object with JRMP and obtaining a stub that communicates to the remote object.
    Stubs are either generated at runtime using dynamic proxy objects,
    or they are generated statically at build time, typically using the rmic tool.

    */
	
    protected fileserver()throws RemoteException{
    super();
    }
    
   @Override
	public void upload(String filename, byte[] fileContent) throws RemoteException{
		File file = new File(filename);
		try {
			if (!file.exists())
				file.createNewFile();
			BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(file));
			os.write(fileContent);
		} catch (Exception e) {
			
			e.printStackTrace();
		
                }

                }
  
    
}
 