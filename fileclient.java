
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;


public class fileclient   {
    public fileclient() {
	}

	private byte[] fileToByte(String filename){
		byte[] b = null;
		try {
			File file = new File(filename);
			b = new byte[(int) file.length()];
			BufferedInputStream is = new BufferedInputStream(new FileInputStream(file));
			is.read(b);
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		return b;}

        public static void main(String[] args) throws FileNotFoundException, IOException {
       
        	
       
		try{
			
			fileserverint server=(fileserverint)Naming.lookup("rmi://localhost:5001/negationservice");
                             server.upload("/media/amr/24838aa3-522e-4060-817d-c2efd23cea51/amr/test/test.java", new fileclient().fileToByte("/media/amr/24838aa3-522e-4060-817d-c2efd23cea51/amr/test/test/test.java"));
			System.out.println("Listening.....");			
			Scanner s=new Scanner(System.in);			
			while(true){
				String line=s.nextLine();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
