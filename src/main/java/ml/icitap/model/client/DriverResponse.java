package ml.icitap.model.client;

public class DriverResponse {

	private String status;
	private Client client;
	private String errorInfo;
	
	public DriverResponse() {
		// TODO Auto-generated constructor stub
	}

	public DriverResponse(String status, Client client, String errorInfo) {
		super();
		this.status = status;
		this.client = client;
		this.errorInfo = errorInfo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DriverResponse [status=");
		builder.append(status);
		builder.append(", client=");
		builder.append(client);
		builder.append(", errorInfo=");
		builder.append(errorInfo);
		builder.append("]");
		return builder.toString();
	}
	
	
}
