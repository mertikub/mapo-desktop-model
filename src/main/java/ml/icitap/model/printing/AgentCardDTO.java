package ml.icitap.model.printing;

public class AgentCardDTO {
	
	private boolean idCard;
	private String cardId;
	private String printTime;

	private String name;
	private String surname;
	private String fullname;
	private String fatherName;
	private String bloodgroup;
	private String birthDate;
	private String birthPlace;
	private String corps;
	private String grade;
	private String organization;
	private String duplicate;
	
	private String officerId;
	private String matricule;
	
	private byte[] photo;
	private String photoFile;
	
	private byte[] signature;
	
	private String template400;
	
	public AgentCardDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getCorps() {
		return corps;
	}

	public void setCorps(String corps) {
		this.corps = corps;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getOfficerId() {
		return officerId;
	}

	public void setOfficerId(String officerId) {
		this.officerId = officerId;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {		
		this.photo = photo;
	}

	public String getPhotoFile() {
		return photoFile;
	}

	public void setPhotoFile(String photoFile) {
		this.photoFile = photoFile;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getPrintTime() {
		return printTime;
	}

	public void setPrintTime(String printTime) {
		this.printTime = printTime;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getTemplate400() {
		return template400;
	}

	public void setTemplate400(String template400) {
		this.template400 = template400;
	}

	public String getDuplicate() {
		return duplicate;
	}

	public void setDuplicate(String duplicate) {
		this.duplicate = duplicate;
	}

	public boolean isIdCard() {
		return idCard;
	}

	public void setIdCard(boolean idCard) {
		this.idCard = idCard;
	}

	public byte[] getSignature() {
		return signature;
	}

	public void setSignature(byte[] signature) {
		this.signature = signature;
	}
	
}
