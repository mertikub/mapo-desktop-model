package ml.icitap.model.client;

public class EncodingResult {

	private long code;
	private String message;
	
	public EncodingResult() {
		// TODO Auto-generated constructor stub
	}

	public EncodingResult(long code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return code +" - "+message;
	}
	
}
