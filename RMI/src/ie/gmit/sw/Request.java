package ie.gmit.sw;
//James Ngondo
public class Request {

	private int maxKeyLen;
	private String cypherText;
	private long jobNumber;
	
	public Request()
	{
		
	}
	public Request(int maxKeyLen, String cypherText, long jobNumber2) {
		setMaxKeyLen(maxKeyLen);
		setCypherText(cypherText);
		setJobNumber(jobNumber2);
	}

	public int getMaxKeyLen() {
		return maxKeyLen;
	}

	public void setMaxKeyLen(int maxKeyLen) {
		this.maxKeyLen = maxKeyLen;
	}

	public String getCypherText() {
		return cypherText;
	}

	public void setCypherText(String cypherText) {
		this.cypherText = cypherText;
	}

	public long getJobNumber() {
		return jobNumber;
	}

	public void setJobNumber(long jobNumber) {
		this.jobNumber = jobNumber;
	}
	
	
}
