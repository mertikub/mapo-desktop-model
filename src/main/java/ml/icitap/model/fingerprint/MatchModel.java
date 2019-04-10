package ml.icitap.model.fingerprint;

import ml.icitap.model.printing.AgentCardDTO;

public class MatchModel {

	private FingerprintModel fingerprintModel;
	private AgentCardDTO agentCardDTO;
	
	public MatchModel() {
		// TODO Auto-generated constructor stub
	}
	
	public MatchModel(FingerprintModel fingerprintModel, AgentCardDTO agentCardDTO) {
		super();
		this.fingerprintModel = fingerprintModel;
		this.agentCardDTO = agentCardDTO;
	}

	public FingerprintModel getFingerprintModel() {
		return fingerprintModel;
	}

	public void setFingerprintModel(FingerprintModel fingerprintModel) {
		this.fingerprintModel = fingerprintModel;
	}

	public AgentCardDTO getAgentCardDTO() {
		return agentCardDTO;
	}

	public void setAgentCardDTO(AgentCardDTO agentCardDTO) {
		this.agentCardDTO = agentCardDTO;
	}
	
	
}
