package ml.icitap.printer.model;

public class PrintingStatusInfo {
	
	int statusCode;
	
	int jobId;
	
	String errorInfo;
	
	public PrintingStatusInfo() {
		// TODO Auto-generated constructor stub
	}

	public PrintingStatusInfo(int jobId) {
		super();
		this.jobId = jobId;
		this.statusCode = 200;
	}

	public PrintingStatusInfo(int statusCode, String errorInfo) {
		super();
		this.statusCode = statusCode;
		this.errorInfo = errorInfo;
	}
	
	public boolean noTemplateFile() {
		return 401==statusCode;
	}
	
	public boolean noPrinter() {
		return 404==statusCode;
	}
	
	public boolean anyError() {
		return 500==statusCode;
	}
	
	public boolean noError() {
		return 200==statusCode;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}
	
	
	
	

}
