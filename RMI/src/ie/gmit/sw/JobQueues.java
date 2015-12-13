package ie.gmit.sw;
//James Ngondo
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class JobQueues {

	public static BlockingQueue<Request> list = new LinkedBlockingQueue<Request>();
	public static Map<Long, String> map = new HashMap<Long, String>();
	
	public JobQueues() {
		super();
		
	}
	
	public static void add(Request r)
	{
		try {
			list.add(r);
			
		} catch (Exception e) {
			
		}
		
	}
	public static String getResult(long jobNumber)
	{
		if(map.containsKey(jobNumber));
		{
			return map.get(jobNumber);
		}
			
	}
	
	
}
