package ml.icitap.printer.model;

public class JobStatusDTO {
	
	public enum Status {
		DONE, ERROR, CANCELLED, IN_PROGRESS, ALARM_HANDLING, CONNECTION_ERROR;
	}
	
	public enum CardPosition {
		FEEDING
	}
	
	private Status printStatus;
	
	private boolean alarmValue;
	private String alarmDescription;
	
	private boolean errorValue;
	private String errorDescription;
	
	private boolean mediaOutOfCards = false;

	private CardPosition cardPosition;
	
	public JobStatusDTO() {
		// TODO Auto-generated constructor stub
	}

	public Status getPrintStatus() {
		return printStatus;
	}

	public void setPrintStatus(Status printStatus) {
		this.printStatus = printStatus;
	}

	public boolean isAlarmValue() {
		return alarmValue;
	}

	public void setAlarmValue(boolean alarmValue) {
		this.alarmValue = alarmValue;
	}

	public String getAlarmDescription() {
		return alarmDescription;
	}

	public void setAlarmDescription(String alarmDescription) {
		this.alarmDescription = alarmDescription;
	}

	public boolean isErrorValue() {
		return errorValue;
	}

	public void setErrorValue(boolean errorValue) {
		this.errorValue = errorValue;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public boolean isMediaOutOfCards() {
		return mediaOutOfCards;
	}

	public void setMediaOutOfCards(boolean mediaOutOfCards) {
		this.mediaOutOfCards = mediaOutOfCards;
	}

	public CardPosition getCardPosition() {
		return cardPosition;
	}

	public void setCardPosition(CardPosition cardPosition) {
		this.cardPosition = cardPosition;
	}
	
	
}
