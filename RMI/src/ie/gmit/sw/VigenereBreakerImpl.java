package ie.gmit.sw;
//James Ngondo
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class VigenereBreakerImpl extends UnicastRemoteObject implements VigenereBreaker {

	private static final long serialVersionUID = 1L;
	//private KeyEnumerator breaker;
	
	public VigenereBreakerImpl() throws Exception {
		
	}
	
	public String decrypt(String cypherText, int maxKeyLength) throws Exception {
		
		KeyEnumerator breaker = new KeyEnumerator();
		return breaker.crackCypher(cypherText, maxKeyLength);
	}

	
}
