package ml.icitap.model.printing;

public class PrintingStatusInfo {
	
	public static final int PRINT_SUCCESS = 0;
	public static final int ERROR_NO_PRINTER_FOUND = 1;
	public static final int ERROR_OTHER = 2;
	public static final int ERROR_NO_TEMPLATE = 3;
	public static final int PRINT_CANCELED = 4;
	public static final int ERROR_ENCODING = 5; 
	
	private int statusCode;
	
	private int jobId;
	
	private String errorInfo;
	
	public PrintingStatusInfo() {	}

	public PrintingStatusInfo(int statusCode, String errorInfo) {
		super();
		this.statusCode = statusCode;
		this.errorInfo = errorInfo;
		this.jobId = -1;
	}
	
	public PrintingStatusInfo(int statusCode, String errorInfo, int jobId) {
		super();
		this.statusCode = statusCode;
		this.errorInfo = errorInfo;
		this.jobId = jobId;
	}
	
	@Override
	public String toString() {
		return String.format("Job: %d, Code: %d, Info: %s", jobId, statusCode, errorInfo);
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
