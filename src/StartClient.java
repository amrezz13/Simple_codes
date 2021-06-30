import java.rmi.Naming;
import java.util.Scanner;
 
 
public class StartClient {
 
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