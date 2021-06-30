import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;
 
 
public class FileServer  extends UnicastRemoteObject implements FileServerInt {
	
	private String file="initial";
	protected FileServer() throws RemoteException {
		super();
	}
 
	public void setFile(String f){
		file=f;
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