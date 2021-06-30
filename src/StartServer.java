import java.rmi.Naming;
 
public class StartServer {
	public static void main(String[] args) {
		try{
			
			java.rmi.registry.LocateRegistry.createRegistry(1100);
			
			FileServer fs=new FileServer();
			fs.setFile("/media/amr/24838aa3-522e-4060-817d-c2efd23cea51/amr/test/test/requirments.txt");			
			Naming.rebind("rmi://192.168.1.7/abc", fs);
			System.out.println("File Server is Ready");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
}