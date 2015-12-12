package ie.gmit.sw;
//James Ngondo
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Worker implements Runnable{

	public Worker() throws MalformedURLException, RemoteException, NotBoundException {
	
	}
	
	public void getList() throws MalformedURLException, RemoteException, NotBoundException
	{
		while(true){
			Request request;
			//implementation of the interface
			VigenereBreaker vb = (VigenereBreaker) Naming.lookup("///cypher-service");
			
			//take first element from head of the list
			request = JobQueues.list.poll();

			if(request != null){
			
				//getting cypher text
				System.out.println("The cipher text is :" + request.getCypherText());
				
				//sending cypher text/ request for processing
				String result = vb.decrypt(request.getCypherText(), request.getMaxKeyLen());
				
				System.out.println("Result is: " + result);
				
				// putting the processed result and job number into the map 
				JobQueues.map.put(request.getJobNumber(), result);
			}
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
	//run the thread
	public void run() {
		try {
			getList();
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			
			e.printStackTrace();
		}
	}
	
	

}
