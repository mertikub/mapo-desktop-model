package ml.icitap.model.client;

public class Client {

	private String webClientId;
	
	private String uri;
	
	public Client() {

	}
	
	public Client(String uri) {
		this.uri = uri;
	}

	public String getWebClientId() {
		return webClientId;
	}

	public void setWebClientId(String webClientId) {
		this.webClientId = webClientId;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
	
	
}
