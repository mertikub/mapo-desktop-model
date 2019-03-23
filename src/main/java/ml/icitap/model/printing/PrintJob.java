package ml.icitap.printer.model;

public class PrintJob {

	private String printer;
	
	private AgentCardDTO agentDto;
	
	private int jobId;
	
	public PrintJob() {
		// TODO Auto-generated constructor stub
	}
	
	

	public PrintJob(String printer, int jobId) {
		super();
		this.printer = printer;
		this.jobId = jobId;
	}



	public PrintJob(String printer, AgentCardDTO agentDto) {
		super();
		this.printer = printer;
		this.agentDto = agentDto;
	}



	public String getPrinter() {
		return printer;
	}

	public void setPrinter(String printer) {
		this.printer = printer;
	}

	public AgentCardDTO getAgentDto() {
		return agentDto;
	}

	public void setAgentDto(AgentCardDTO agentDto) {
		this.agentDto = agentDto;
	}



	public int getJobId() {
		return jobId;
	}



	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	
	
}
