package ml.icitap.model.client;

import ml.icitap.model.printing.AgentCardDTO;

public class CardResponse {

	private int code;
	private String message;
	private String officerId;
	private AgentCardDTO agent;
	
	public CardResponse(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	
	public CardResponse(String officerId) {
		this(CardConstants.SCARD_S_SUCCESS, "");		
		this.officerId = officerId;
	}

	public CardResponse(AgentCardDTO agent) {
		this(CardConstants.SCARD_S_SUCCESS, "");
		this.agent = agent;
	}
	
	public CardResponse() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean noCardPresent() {
		return CardConstants.MCARD_W_REMOVED_CARD==code;
	}
	
	public boolean noReaders() {
		return CardConstants.SCARD_E_NO_READERS_AVAILABLE==code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getOfficerId() {
		return officerId;
	}

	public void setOfficerId(String officerId) {
		this.officerId = officerId;
	}

	public AgentCardDTO getAgent() {
		return agent;
	}

	public void setAgent(AgentCardDTO agent) {
		this.agent = agent;
	}
	
	
}
