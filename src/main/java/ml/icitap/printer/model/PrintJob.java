package ml.icitap.printer.model;

public class PrintJob {

	private String printer;
	
	private AgentDTO agentDto;
	
	public PrintJob() {
		// TODO Auto-generated constructor stub
	}
	
	

	public PrintJob(String printer, AgentDTO agentDto) {
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

	public AgentDTO getAgentDto() {
		return agentDto;
	}

	public void setAgentDto(AgentDTO agentDto) {
		this.agentDto = agentDto;
	}
	
	
}
