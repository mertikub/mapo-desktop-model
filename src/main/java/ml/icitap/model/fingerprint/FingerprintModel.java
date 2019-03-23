package ml.icitap.model.fingerprint;

public class FingerprintModel {

	public static final int PASS = 1;
	public static final int FAIL = 0;
	
	private int result;
	private String failMessage;
	private String imageBase64;
	private int imageQuality;
	private String templateSG400Base64;
	
	public FingerprintModel() {	}
	
	private FingerprintModel(int result, String msg) {
		this.result = result;
		this.failMessage = msg;
	}
	
	public static FingerprintModel fail(String msg) {
		return new FingerprintModel(FAIL, msg);
	}
	
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public String getImageBase64() {
		return imageBase64;
	}
	public void setImageBase64(String imageBase64) {
		this.imageBase64 = imageBase64;
	}

	public String getFailMessage() {
		return failMessage;
	}

	public void setFailMessage(String failMessage) {
		this.failMessage = failMessage;
	}

	public String getTemplateSG400Base64() {
		return templateSG400Base64;
	}

	public void setTemplateSG400Base64(String templateSG400Base64) {
		this.templateSG400Base64 = templateSG400Base64;
	}

	public int getImageQuality() {
		return imageQuality;
	}

	public void setImageQuality(int imageQuality) {
		this.imageQuality = imageQuality;
	}


	
	
	
}
