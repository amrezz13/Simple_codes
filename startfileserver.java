
import java.io.FileOutputStream;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


public class startfileserver {
   
    public static void main(String[] args) {
    
    try{
     fileserverint fint=new fileserver();
     LocateRegistry.createRegistry(5001);
	Naming.rebind("rmi://localhost:5001/negationservice", fint);
	System.out.println("File Server is Ready");		
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
}
